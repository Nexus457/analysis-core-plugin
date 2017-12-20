package io.jenkins.plugins.analysis.core.steps;

import edu.hm.hafner.analysis.Issue;

import hudson.plugins.analysis.util.ToolTipProvider;

/**
 * Provides UI labels and texts for a specific static analysis tool.
 *
 * @author Ullrich Hafner
 */
public interface StaticAnalysisLabelProvider extends ToolTipProvider {
    String getName();

    String getLinkName();

    String getTrendName();

    String getSmallIconUrl();

    String getLargeIconUrl();

    String getResultUrl();

    /**
     * Returns a detailed description of the specified issue.
     *
     * @param issue the issue to get the description for
     * @return the description
     */
    String getDescription(Issue issue);

    /**
     * Returns a summary message for the summary.jelly file.
     *
     * @param numberOfIssues
     *         the number of issues in the report
     * @param numberOfModules
     *         the number of modules in the report
     *
     * @return the summary message
     */
    String getSummary(int numberOfIssues, int numberOfModules);

    /**
     * Creates a default delta message for the build result.
     *
     * @param newSize
     *         number of new issues
     * @param fixedSize
     *         number of fixed issues
     *
     * @return the summary message
     */
    String getDeltaMessage(int newSize, int fixedSize);

    String getId();
}
