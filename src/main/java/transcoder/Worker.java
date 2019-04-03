package transcoder;

public class Worker {
	
	private JobQueue jobQueue;
	private Transcoder transcoder;
	
	public Worker(JobQueue jobQueue, Transcoder transcoder) {
		this.jobQueue = jobQueue;
		this.transcoder = transcoder;
	}
	
	public void setJobQueue(JobQueue jobQueue) {
		this.jobQueue = jobQueue;
	}
	
	public void setTranscoder(Transcoder transcoder) {
		this.transcoder = transcoder;
	}
	
	public void run( ){
		JobData jobData = jobQueue.getJob();
		while(jobData != null) {
			transcoder.transcode(jobData.getSource(), jobData.getTarget());
			jobData = jobQueue.getJob();
		}
	}
}
