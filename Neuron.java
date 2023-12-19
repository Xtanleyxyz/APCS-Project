import java.util.Random;

public class Neuron {
    /* Represents a single neuron in a neural network */
    private double[] weights;
    private double bias;

    /* Constructor to initialize a neuron with a specific number of inputs */
    /*
    Purpose: Constructor initializes a neuron with a specific number of inputs.
    How it Works:
    1. Creates an array of weights, one for each input.
    2. Initializes each weight with a random value.
    3. Initializes the bias with a random value.
    */
    public Neuron(int inputCount) {
        weights = new double[inputCount];
        initializeWeights();
        bias = Math.random(); // Initialize bias with a random value
    }

    /* Initialize weights with random values */
    private void initializeWeights() {
        Random random = new Random();
        for (int i = 0; i < weights.length; i++) {
            weights[i] = random.nextDouble(); // Initialize each weight with a random value
        }
    }

    /*
    Calculate the output of the neuron based on inputs.
    Contains the sigmoid function.
    1. Initialize a sum and multiply the values (index-wise) of the inputs
    array for the number of neurons to the weights array.
    2. Increment sum every iteration and add bias to it at the end.
    3. Returns the output as a double.
    */
    public double output(double[] inputs) {
        double sum = 0.0;
        for (int i = 0; i < weights.length; i++) {
            sum += inputs[i] * weights[i]; // Multiply input by weight and add to sum
        }
        sum += bias; // Add bias to the sum
        return sigmoid(sum); // Apply sigmoid function and return the result
    }

    /* Transforms input to a value between 0 and 1 using the sigmoid function */
    private double sigmoid(double x) {
        return 1 / (1 + Math.exp(-x)); // Sigmoid function
    }
}
