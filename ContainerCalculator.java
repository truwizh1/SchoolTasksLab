public class ContainerCalculator {

    public static void main(String[] args) {
        int amountOfBricks = 77;
        System.out.println("Amount of Lego bricks: " + amountOfBricks);

        int containerCapacity = 8;
        System.out.println("Container capacity (Lego blocks per container): " + containerCapacity);

        int fullContainers = amountOfBricks / containerCapacity;
        System.out.println("Number of full containers: " + fullContainers);

        int totalContainers = (amountOfBricks % containerCapacity == 0) ? fullContainers : fullContainers + 1;
        System.out.println("Total number of containers needed (full and not full): " + totalContainers);

        int bricksInNotFullContainer = amountOfBricks % containerCapacity;
        System.out.println("Bricks in the not completely full container: " + bricksInNotFullContainer);
    }
}
