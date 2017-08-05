package net.crazysnailboy.mods.infinimend.asm;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import com.google.common.eventbus.EventBus;
import net.minecraftforge.fml.common.DummyModContainer;
import net.minecraftforge.fml.common.LoadController;
import net.minecraftforge.fml.common.ModMetadata;
import net.minecraftforge.fml.common.versioning.InvalidVersionSpecificationException;
import net.minecraftforge.fml.common.versioning.VersionRange;


public class IMModContainer extends DummyModContainer
{
	private URL updateJSONUrl = null;

	public IMModContainer()
	{
		super(new ModMetadata());
		ModMetadata meta = getMetadata();
		meta.modId = "infinimend";
		meta.name = "Infinity & Mending Unnerf";
		meta.version = "${version}";
		meta.description = "Removes the restriction preventing Infinity from being used with Mending";
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

	@Override
	public URL getUpdateUrl()
	{
		try { return new URL(getMetadata().updateJSON); } catch (MalformedURLException e) { return null; }
	}

    @Override
    public VersionRange acceptableMinecraftVersionRange()
    {
        try
		{
			return VersionRange.createFromVersionSpec("[1.12,1.12.1]");
		}
		catch (InvalidVersionSpecificationException ex)
		{
			return super.acceptableMinecraftVersionRange();
		}
    }

}
