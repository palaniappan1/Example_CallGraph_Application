import config.CallGraphAlgorithm;
import config.CallGraphConfig;
import driver.CallGraphApplication;
import metrics.CallGraphMetricsWrapper;
import soot.jimple.toolkits.callgraph.CallGraph;

public class Main {

    public static void main(String[] args) {
        CallGraphMetricsWrapper callGraphMetricsWrapper = CallGraphApplication.generateCallGraph(null, generateQilinCallGraphConfig());
        CallGraph callGraph = callGraphMetricsWrapper.getCallGraph();
        System.out.println(callGraph.size());
    }


    public static CallGraphConfig generateQilinCallGraphConfig(){
        CallGraphConfig callGraphConfig = CallGraphConfig.getInstance();
        callGraphConfig.setCallGraphAlgorithm(CallGraphAlgorithm.QILIN);
        callGraphConfig.setIsSootSceneProvided(false);
        callGraphConfig.setQilinPta("1c");
        callGraphConfig.setAppPath("example");
        callGraphConfig.setJAR_PATH("libs/JREs/jre1.6.0_45");
        callGraphConfig.setMainClass("CallGraph");
        return callGraphConfig;
    }
}
