package net.crazysnailboy.mods.infinimend.asm;

import java.util.Map;
import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;

@IFMLLoadingPlugin.MCVersion("1.12")
@IFMLLoadingPlugin.TransformerExclusions("net.crazysnailboy.mods.infinimend.asm")
public class IMLoadingPlugin implements IFMLLoadingPlugin
{

	@Override
	public String[] getASMTransformerClass()
	{
		return new String[] { "net.crazysnailboy.mods.infinimend.asm.IMClassTransformer" };
	}

	@Override
	public String getModContainerClass()
	{
		return "net.crazysnailboy.mods.infinimend.asm.IMModContainer";
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
