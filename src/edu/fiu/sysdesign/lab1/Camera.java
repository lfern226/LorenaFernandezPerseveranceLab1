/**
 * 
 */
package edu.fiu.sysdesign.lab1;

/**
 * @author lfern
 *
 */
public class Camera {
/**
		 * @author lfern
		 *
		 */
	public class Mast_Cam {
int zoom_lens;
String science_cam;

void takes_color_pictures()
/**
 * This operation is specific to the Mast_Cam as it captures images in color
 */
{}

void takes_color_videos()
/**
 * This operation is specific to the Mast_Cam as it records videos in color
 */
{}

void provides_3d_views()
/**
 * This operation of providing 3d views occurs as the cameras are next to each other, pointing in the same direction
 */
{}
	}

/**
		 * @author lfern
		 *
		 */
	public class Cache_Cam {
int microscopic_lens;

void takes_microscopic_picture()
/**
 * This operation transpires as the lens' strength is large enough to take microscopic pictures
 */
{}

void records_sample_collection()
/**
 * This operation basically stores the entire process of each sample collection for the scientists to later review
 */
{}

void watch_over_samples()
/**
 * This operation aides the scientists by viewing the samples as they are acquired
 */
{}
	}

/**
		 * @author lfern
		 *
		 */
	public class Haz_Cam {
String front_camera;
String rear_camera;

void detects_obstacles()
/**
 * This operation is meant to detect and avoid hazards/obstacles from the Rover's path such as large rocks, trenches, or sand dunes
 */
{}

void view_robotic_arm_movement()
/**
 * This operation allows engineers to not only see where to move the Rover's arm but allows them to get the appropriate angle to take measurements, pictures and collect samples
 */
{}

void provides_3d_views()
/**
 * This operation describes the Rover frequently stopping while it's driving around Mars, and captures/provides 360 images of the path it's on and what lies ahead 
 */
{}
	}

/**
		 * @author lfern
		 *
		 */
	public class Nav_Cam {
String left_camera;
String right_camera;

void navigate_safe_path()
{}
/**
 * This operation permits the Rover to navigate safely and autonomously when engineers command the rover to drive a certain distance and direction once a safe path is established
 */
	}

String lens;

void record_videos()
/**
 * This operation is a general function of a camera which is the ability to record videos
 */
{}

void take_pictures()
/**
 * This operation is a general function of a camera which is the ability to capture images/take pictures
 */
{}

}
