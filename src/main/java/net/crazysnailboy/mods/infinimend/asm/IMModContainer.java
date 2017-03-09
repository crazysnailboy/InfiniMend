package net.crazysnailboy.mods.infinimend.asm;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;

import com.google.common.eventbus.EventBus;

import net.minecraftforge.fml.common.DummyModContainer;
import net.minecraftforge.fml.common.LoadController;
import net.minecraftforge.fml.common.ModMetadata;


public class IMModContainer extends DummyModContainer
{
	private URL updateJSONUrl = null;

	public IMModContainer()
	{
		super(new ModMetadata());
		ModMetadata meta = getMetadata();
		meta.modId = "infinimend";
		meta.name = "InfiniMend";
		meta.version = "1.0";
		meta.description = "Removes the restriction stopping Infinity from being used with Mending";
		meta.url = "https://minecraft.curseforge.com/projects/infinity-mending-unnerf";
		meta.updateJSON = "https://raw.githubusercontent.com/crazysnailboy/InfiniMend/master/update.json";
		meta.authorList = Collections.singletonList("crazysnailboy");

		try { updateJSONUrl = new URL(meta.updateJSON); } catch (MalformedURLException e) {}
	}

	@Override
	public boolean registerBus(EventBus bus, LoadController controller)
	{
		bus.register(this);
		return true;
	}

	@Override
	public URL getUpdateUrl()
	{
		return updateJSONUrl;
	}

}
