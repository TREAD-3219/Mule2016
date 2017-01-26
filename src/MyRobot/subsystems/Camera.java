package MyRobot.subsystems;

import org.opencv.core.Mat;

import edu.wpi.cscore.CvSink;
import edu.wpi.cscore.CvSource;
import edu.wpi.cscore.VideoMode;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Camera extends Subsystem {
	private CvSource output;
    private CvSink source;
    private Mat image;
    public void updateCamera() {
    	source.grabFrame(image);
    	output.putFrame(image);
    }
    
    public Mat getImage() {
    	return image.clone();
    }
	@Override
	protected void initDefaultCommand() {
		output = new CvSource("3219-CvSource", VideoMode.PixelFormat.kMJPEG, 640, 480, (int) 20);
    	source = new CvSink("3219-CvSink");
    	image = new Mat();
		
	}

}
