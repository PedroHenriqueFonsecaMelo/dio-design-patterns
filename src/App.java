

public class App {
    private static Singleton singleton;

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        singleton = Singleton.getUniqueInstance();

        
        HomeTheaterFacade theaterFacade = new HomeTheaterFacade(
                new Amplifier(),
                new Tuner(),
                new DvdPlayer(),
                new CdPlayer(),
                new Projector(),
                new TheatreLights(),
                new Screen(),
                new PopcornPopper());

        theaterFacade.watchMovie("Avengers");
        theaterFacade.endMovie();

        // Red Head Duck
        IFlyBehaviour flyBehaviour = new FlyWithWings();
        IQuackBehaviour quackBehaviour = new Quack();

        Duck redHeadDuck = new RedHeadDuck();
        redHeadDuck.setFlyBehaviour(flyBehaviour);
        redHeadDuck.setQuackBehaviour(quackBehaviour);

        redHeadDuck.performQuack();
        redHeadDuck.performFly();

        // Rubber Duck
        IFlyBehaviour noFlyBehaviour = new FlyNoWay();
        IQuackBehaviour squeekBehaviour = new Squeek();

        Duck rubberDuck = new RubberDuck();
        rubberDuck.setQuackBehaviour(squeekBehaviour);
        rubberDuck.setFlyBehaviour(noFlyBehaviour);

        rubberDuck.performFly();
        rubberDuck.performQuack();

        // Wodden Duck
        IQuackBehaviour noQuackBehaviour = new MuteQuack();

        Duck woddenDuck = new WoddenDuck();
        woddenDuck.setFlyBehaviour(noFlyBehaviour);
        woddenDuck.setQuackBehaviour(noQuackBehaviour);

        woddenDuck.performQuack();
        woddenDuck.performFly();

    }
}
