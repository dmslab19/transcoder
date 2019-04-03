package ffmpegtranscoder;

import transcoder.Transcoder;

public class FfmpegTranscoder implements Transcoder {

	@Override
	public void transcode(String src, String tgt) {

		//transcoding()

		System.out.println(
				"Transcode the file in " + src + " using FF-MPEG. The transformed file is saved in " + tgt + ".");
	}
}