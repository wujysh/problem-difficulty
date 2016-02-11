package cn.edu.dhu.acm.problem.difficulty.codeforces.response;

import cn.edu.dhu.acm.problem.difficulty.codeforces.entity.Problem;
import cn.edu.dhu.acm.problem.difficulty.codeforces.entity.ProblemStatistics;

import java.util.List;

/**
 * Created by wujy on 16-1-16.
 */
public class ProblemResponseResult {

    private List<Problem> problems;

    private List<ProblemStatistics> problemStatistics;

    public List<Problem> getProblems() {
        return problems;
    }

    public void setProblems(List<Problem> problems) {
        this.problems = problems;
    }

    public List<ProblemStatistics> getProblemStatistics() {
        return problemStatistics;
    }

    public void setProblemStatistics(List<ProblemStatistics> problemStatistics) {
        this.problemStatistics = problemStatistics;
    }

}
