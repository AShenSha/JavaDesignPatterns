package adapter.impl2;

/**
 * @author ShenSha on 2018/11/19
 */
public class Client {
    public static void main(String[] args) {
        ScoreOperation scoreOperation ;
        scoreOperation = (ScoreOperation) XMLUtil.getBean();
        int scores[] = {84,76,50,69,90,91,88,96};
        int result[];
        int score;
        System.out.println("成绩排序结果");
        result = scoreOperation.sort(scores);
        for(int i : scores) {
            System.out.print(i + ",");
        }
        System.out.println("-----------------");
        System.out.println("查找成绩90：");
        score = scoreOperation.search(result,90);
        if (score != -1) {
            System.out.println("找到成绩90。");
        }
        else {
            System.out.println("没有找到成绩90。");
        }
        System.out.println("查找成绩92：");
        score = scoreOperation.search(result,92);
        if (score != -1) {
            System.out.println("找到成绩92。");
        }
        else {
            System.out.println("没有找到成绩92。");
        }
    }
}
