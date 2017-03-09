package net.crazysnailboy.mods.infinimend.asm;

import java.util.Collections;

import com.google.common.eventbus.EventBus;

import net.minecraftforge.fml.common.DummyModContainer;
import net.minecraftforge.fml.common.LoadController;
import net.minecraftforge.fml.common.ModMetadata;


public class IMModContainer extends DummyModContainer
{

	public IMModContainer()
	{
		super(new ModMetadata());
		ModMetadata meta = getMetadata();
		meta.modId = "infinimend";
		meta.name = "InfiniMend";
		meta.description = "Removes the restriction stopping Infinity from being used with Mending";
		meta.version = "1.11.2-1.0";
		meta.url = "https://minecraft.curseforge.com/projects/infinity-mending-unnerf";
		meta.updateJSON = "https://raw.githubusercontent.com/crazysnailboy/InfiniMend/master/update.json";
		meta.authorList = Collections.singletonList("crazysnailboy");
	}

	@Override
	public boolean registerBus(EventBus bus, LoadController controller)
	{
		bus.register(this);
		return true;
	}

}
