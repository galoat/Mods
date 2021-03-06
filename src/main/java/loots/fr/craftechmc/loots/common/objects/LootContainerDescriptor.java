package fr.craftechmc.loots.common.objects;

public class LootContainerDescriptor
{
    private String name;
    private String material;
    private int    slots;
    private int    lightning;
    private String texture;
    private String model;
    private String openedModel;
    private float  offsetX, offsetY, offsetZ, renderOffsetX, renderOffsetY, renderOffsetZ, width, height, length;
    private String orientable;

    public float getScale()
    {
        return Math.max(this.getLength(), Math.max(this.getWidth(), this.getHeight()));
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(final String name)
    {
        this.name = name;
    }

    public String getMaterial()
    {
        return this.material;
    }

    public void setMaterial(final String material)
    {
        this.material = material;
    }

    public int getSlots()
    {
        return this.slots;
    }

    public void setSlots(final int slots)
    {
        this.slots = slots;
    }

    public int getLightning()
    {
        return this.lightning;
    }

    public void setLightning(final int lightning)
    {
        this.lightning = lightning;
    }

    public String getTexture()
    {
        return this.texture;
    }

    public void setTexture(final String texture)
    {
        this.texture = texture;
    }

    public String getModel()
    {
        return this.model;
    }

    public void setModel(final String model)
    {
        this.model = model;
    }

    public String getOpenedModel()
    {
        return this.openedModel;
    }

    public void setOpenedModel(final String openedModel)
    {
        this.openedModel = openedModel;
    }

    public float getOffsetX()
    {
        return this.offsetX;
    }

    public void setOffsetX(final float offsetX)
    {
        this.offsetX = offsetX;
    }

    public float getOffsetY()
    {
        return this.offsetY;
    }

    public void setOffsetY(final float offsetY)
    {
        this.offsetY = offsetY;
    }

    public float getOffsetZ()
    {
        return this.offsetZ;
    }

    public void setOffsetZ(final float offsetZ)
    {
        this.offsetZ = offsetZ;
    }

    public float getRenderOffsetX()
    {
        return this.renderOffsetX;
    }

    public void setRenderOffsetX(final float renderOffsetX)
    {
        this.renderOffsetX = renderOffsetX;
    }

    public float getRenderOffsetY()
    {
        return this.renderOffsetY;
    }

    public void setRenderOffsetY(final float renderOffsetY)
    {
        this.renderOffsetY = renderOffsetY;
    }

    public float getRenderOffsetZ()
    {
        return this.renderOffsetZ;
    }

    public void setRenderOffsetZ(final float renderOffsetZ)
    {
        this.renderOffsetZ = renderOffsetZ;
    }

    public float getWidth()
    {
        return this.width;
    }

    public void setWidth(final float width)
    {
        this.width = width;
    }

    public float getHeight()
    {
        return this.height;
    }

    public void setHeight(final float height)
    {
        this.height = height;
    }

    public float getLength()
    {
        return this.length;
    }

    public void setLength(final float length)
    {
        this.length = length;
    }

    public String getOrientable()
    {
        return this.orientable;
    }

    public void setOrientable(final String orientable)
    {
        this.orientable = orientable;
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + Float.floatToIntBits(this.height);
        result = prime * result + Float.floatToIntBits(this.length);
        result = prime * result + this.lightning;
        result = prime * result + (this.material == null ? 0 : this.material.hashCode());
        result = prime * result + (this.model == null ? 0 : this.model.hashCode());
        result = prime * result + (this.name == null ? 0 : this.name.hashCode());
        result = prime * result + Float.floatToIntBits(this.offsetX);
        result = prime * result + Float.floatToIntBits(this.offsetY);
        result = prime * result + Float.floatToIntBits(this.offsetZ);
        result = prime * result + (this.openedModel == null ? 0 : this.openedModel.hashCode());
        result = prime * result + (this.orientable == null ? 0 : this.orientable.hashCode());
        result = prime * result + Float.floatToIntBits(this.renderOffsetX);
        result = prime * result + Float.floatToIntBits(this.renderOffsetY);
        result = prime * result + Float.floatToIntBits(this.renderOffsetZ);
        result = prime * result + this.slots;
        result = prime * result + (this.texture == null ? 0 : this.texture.hashCode());
        result = prime * result + Float.floatToIntBits(this.width);
        return result;
    }

    @Override
    public boolean equals(final Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (this.getClass() != obj.getClass())
            return false;
        final LootContainerDescriptor other = (LootContainerDescriptor) obj;
        if (Float.floatToIntBits(this.height) != Float.floatToIntBits(other.height))
            return false;
        if (Float.floatToIntBits(this.length) != Float.floatToIntBits(other.length))
            return false;
        if (this.lightning != other.lightning)
            return false;
        if (this.material == null)
        {
            if (other.material != null)
                return false;
        }
        else if (!this.material.equals(other.material))
            return false;
        if (this.model == null)
        {
            if (other.model != null)
                return false;
        }
        else if (!this.model.equals(other.model))
            return false;
        if (this.name == null)
        {
            if (other.name != null)
                return false;
        }
        else if (!this.name.equals(other.name))
            return false;
        if (Float.floatToIntBits(this.offsetX) != Float.floatToIntBits(other.offsetX))
            return false;
        if (Float.floatToIntBits(this.offsetY) != Float.floatToIntBits(other.offsetY))
            return false;
        if (Float.floatToIntBits(this.offsetZ) != Float.floatToIntBits(other.offsetZ))
            return false;
        if (this.openedModel == null)
        {
            if (other.openedModel != null)
                return false;
        }
        else if (!this.openedModel.equals(other.openedModel))
            return false;
        if (this.orientable == null)
        {
            if (other.orientable != null)
                return false;
        }
        else if (!this.orientable.equals(other.orientable))
            return false;
        if (Float.floatToIntBits(this.renderOffsetX) != Float.floatToIntBits(other.renderOffsetX))
            return false;
        if (Float.floatToIntBits(this.renderOffsetY) != Float.floatToIntBits(other.renderOffsetY))
            return false;
        if (Float.floatToIntBits(this.renderOffsetZ) != Float.floatToIntBits(other.renderOffsetZ))
            return false;
        if (this.slots != other.slots)
            return false;
        if (this.texture == null)
        {
            if (other.texture != null)
                return false;
        }
        else if (!this.texture.equals(other.texture))
            return false;
        if (Float.floatToIntBits(this.width) != Float.floatToIntBits(other.width))
            return false;
        return true;
    }

    @Override
    public String toString()
    {
        return "LootContainerDescriptor [name=" + this.name + ", material=" + this.material + ", slots=" + this.slots
                + ", lightning=" + this.lightning + ", texture=" + this.texture + ", model=" + this.model
                + ", openedModel=" + this.openedModel + ", offsetX=" + this.offsetX + ", offsetY=" + this.offsetY
                + ", offsetZ=" + this.offsetZ + ", renderOffsetX=" + this.renderOffsetX + ", renderOffsetY="
                + this.renderOffsetY + ", renderOffsetZ=" + this.renderOffsetZ + ", width=" + this.width + ", height="
                + this.height + ", length=" + this.length + ", orientable=" + this.orientable + "]";
    }
}