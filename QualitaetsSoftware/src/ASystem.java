public abstract class ASystem
{
    private int numberOfComponents;
    private double[] lambdaI;

    public ASystem(int numberOfComponents, double[] lambdaI)
    {
        this.numberOfComponents = numberOfComponents;
        this.lambdaI = lambdaI.clone();
    }

    public abstract double getRP();
    public abstract double getFP();
}
