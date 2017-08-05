package net.crazysnailboy.mods.infinimend.asm;

import java.util.Map;
import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;


@IFMLLoadingPlugin.TransformerExclusions("net.crazysnailboy.mods.infinimend")
public class IMLoadingPlugin implements IFMLLoadingPlugin
{

	@Override
	public String[] getASMTransformerClass()
	{
		return new String[] { IMClassTransformer.class.getName() };
	}

	@Override
	public String getModContainerClass()
	{
		return IMModContainer.class.getName();
	}

	@Override
	public String getSetupClass()
	{
		return null;
	}

	@Override
	public void injectData(Map<String, Object> data)
	{
	}

	@Override
	public String getAccessTransformerClass()
	{
		return null;
	}

}
