public class Test_Layer {
    private Neuron[] neurons;

    /* Constructor creates a layer with a specified number of neurons */
    /*
    Purpose: Constructor initializes a layer with a specified number of neurons.
    How it Works:
    1. Initializes the neurons array with a size of neuronCount.
    2. Creates new Neuron objects for each element inside the neurons array.
    */
    public Test_Layer(int neuronCount, int inputCount) {
        neurons = new Neuron[neuronCount];
        initializeNeurons(inputCount);
    }

    /* Initialize neurons with a specified number of inputs */
    private void initializeNeurons(int inputCount) {
        for (int i = 0; i < neurons.length; i++) {
            neurons[i] = new Neuron(inputCount); // Create Neuron objects with a specified number of inputs
        }
    }

    /* Calculate the output of neurons based on inputs */
    /*
    1. Initializes an outputs array with a size equal to the length of the neurons array.
    2. Calculates outputs for each Neuron object in the neurons array.
    3. Returns the output as a double array.
    */
    public double[] output(double[] inputs) {
        double[] outputs = new double[neurons.length];
        for (int i = 0; i < neurons.length; i++) {
            outputs[i] = neurons[i].output(inputs); // Calculate output for each neuron
        }
        return outputs;
    }
}
