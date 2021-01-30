package Animals;

abstract class ATerestrial extends AAnimal implements iRunable {

    ATerestrial() {

    }

    ATerestrial(String name) {
        super(name);
    }

    @Override
    String sound() {
        return super.sound() + "meow";
    }

    @Override
    String born() {
        return super.born() + "mammal";
    }

    @Override
    String move() {
        return super.move() + running();
    }

    @Override
    public String running() {
        return "running very fast";
    }

}
