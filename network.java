public class Test_Network {
    // Represents the entire neural net, consisting of multiple layers
    private Test_Layer[] layers;

    /* Constructor to create a neural network with specified layers */
    /*
    Purpose: Constructor initializes the neural network with a specific number of inputs.
    How it Works:
    1. Initializes an array of layers with a length equal to the length of the layerSizes array passed from
       the "SimpleDialogueSystem" class in the main method.
    2. Iterates through the above array. During this:
        a. Sets an int variable 'prevLayerSize' every iteration to set the size
           of the previous layer.
           For the first layer (i = 0), sets the variable to the inputSize.
           Otherwise, the variable is set to the size of the previous layer in the layerSizes
           array.
        b. Sets the value at each index to a newly created Test_Layer object with the
           current layer size and 'prevLayerSize'.
    */
    public Test_Network(int inputSize, int[] layerSizes) {
        layers = new Test_Layer[layerSizes.length];
        for (int i = 0; i < layers.length; i++) {
            int currentLayerSize = layerSizes[i];
            int prevLayerSize = (i == 0) ? inputSize : layerSizes[i - 1];
            layers[i] = new Test_Layer(currentLayerSize, prevLayerSize);
        }
    }

    /* Calculates the output of the network */
    /*
    1. Creates an array that stores the double[] inputs array.
    2. Iterates through the layers array created above and sets each value of the
       array by calling the output() function for the
       current layer on each respective input value. We are calculating the output
       of each layer, but only returning the output of the final one.
    3. Returns the array.
    */
    public double[] output(double[] inputs) {
        for (Test_Layer layer : layers) {
            inputs = layer.output(inputs);
        }
        return inputs;
    }
}
