package Project3.service;

import Project3.domain.Architect;
import Project3.domain.Designer;
import Project3.domain.Employee;
import Project3.domain.Programmer;

/** 功能：关于开发团队成员的管理：添加、删除等。
 * @author CJYong
 * @create 2021-06-04 9:43
 */

public class TeamService {
    private static int counter = 1; // 给memberID赋值使用
    private int MAX_MEMBER = 5;  //  限制开发团队的的人数
    private Programmer[] team = new Programmer[MAX_MEMBER];  //保存开发团队成员

    private int total;  // 记录开发团队中的实际人数

    public TeamService() {
    }

    /**
     * 获取开发团队中的所有成员
     * @return
     */
    public Programmer[] getTeam(){
        Programmer[] team = new Programmer[total];
        for (int i = 0; i < team.length; i++) {
            team[i] = this.team[i];
        }
        return team;
    }

    /**
     * 将指定的员工添加到开发团队中
     * @param e
     */
    public  void addMember(Employee e) throws TeamException {
        // 成员已满，无法添加
        if (total >= MAX_MEMBER){
            throw new TeamException("成员已满，无法添加");
        }
        // 该成员不是发开人员，无法添加
        if (!(e instanceof Programmer)){
            throw new TeamException("该成员不是发开人员，无法添加");
        }
        //该员工已在本开发团队中
        if(isExist(e)){
            throw new TeamException("该员工已在本开发团队中");
        }
        //该员工已经在某团队成员

        //该员工正在休假，无法添加

        Programmer P = (Programmer) e;  // 一定不会出现转化异常
        if (P.getStatus().getNAME().equals("BUSY")){
            throw new TeamException("该员工已是某团队成员");
        }else if ("VOCATION".equals(P.getStatus().getNAME())){
            throw new TeamException("该员工正在休假，无法添加");
        }
        int numOfArch = 0,numOfDes = 0,numOfPro = 0;
        //团队中至多只能有一名架构师
        for (int i = 0; i < total; i++) {
            if (team[i] instanceof Architect){
                numOfArch++;
            }else if (team[i] instanceof Designer){
                numOfDes++;
            }else if (team[i] instanceof Programmer){
                numOfPro++;
            }
        }
        if (P instanceof Architect){
            if (numOfArch >= 1){
                throw new TeamException("团队中至多只能有一名架构师");
            }
        }else if (P instanceof Designer) {
            //团队中至多只能有两名设计师
            if (numOfDes >= 2){
                throw new TeamException("团队中至多只能有两名设计师");
            }
        }else if (P instanceof Programmer) {
            //团队中至多只能有三名程序员
            if (numOfPro >= 3){
                throw new TeamException("团队中至多只能有三名程序员");
            }
        }

        // 将P 添加到现有的team中
        team[total++] = P;
        //P的属性赋值
        P.setStatus(Status.BUSY);
        P.setMeberId(counter++);
    }

    /**
     * 判断指定员工是否已存在于现有的开发团队中
     * @param e
     * @return
     */
    private boolean isExist(Employee e) {
        for (int i = 0; i < total; i++) {
            if(team[i].getId() == e.getId()){
                return true;
            }
        }
        return false;
    }

    /**
     * 从团队当中删除指定成员
     * @param memberID
     */
    int i = 0;
    public void removeMember(int memberID) throws TeamException {
        for (; i < total; i++) {
            if (team[i].getMeberId() == memberID){
                team[i].setStatus(Status.FREE);
                break;
            }
        }

        //未找到指定ID的情况
        if ( i == total){
            throw new TeamException("找不到指定MemberID的员工，删除失败");
        }

        // 后一个元素覆盖前一个元素，实现删除操作
        for (int j = i+1; j < total; j++) {
            team[j - 1] = team[j];
        }
        team[total-1] = null;
        total--;
        // 或者 team[ -- total] = null;
    }

}
