package CL7.InnerClass.Practice2;

/**
 * @author Promise
 * @create 2019-07-29-16:20
 */
public class DemoGame {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("艾希");

//        hero.setSkill(new SkillImpl());//使用单独定义的实现类

        //使用匿名内部类
//        Skill skill = new Skill() {
//            @Override
//            public void use() {
//                System.out.println("!!!!!!!");
//            }
//        };
//        hero.setSkill(skill);

        //进一步简化，同时使用匿名内部类和匿名对象
        hero.setSkill(new Skill() {
            @Override
            public void use() {
                System.out.println("~~~~~~~~~~~~");
            }
        });
        hero.attack();
    }
}
