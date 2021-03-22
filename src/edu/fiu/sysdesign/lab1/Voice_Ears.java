/**
 * 
 */
package edu.fiu.sysdesign.lab1;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

/**
 * @author lfern
 *
 */
public class Voice_Ears implements SelfCheckCapable {
String ultra_high_frq_antenna;
String xband_highgain_antenna;
String xband_lowgain_antenna;

Nasa communicate_nasa()
{return null;}

Nasa transmit_data()
{return null;}

Nasa receive_data()
{return null;}


	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "my Voice_Ears";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.3);
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.basicSelfCheckRunner(this);
	}

}
