package cn.edu.dhu.acm.problem.difficulty.codeforces;

import cn.edu.dhu.acm.problem.difficulty.codeforces.entity.Submission;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * Created by wujy on 16-1-18.
 */
public class DataProvider {

    public static BlockingQueue<Submission> unPutSubmissionQueue = new LinkedBlockingDeque<Submission>();

}
