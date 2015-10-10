package estate.entity.database;

/**
 * Created by kangbiao on 15-9-13.
 *
 */
public class NoticeEntity
{
    private Integer id;
    private String title;
    private String content;
    private String time;
    private String pictureIdList;
    private String description;
    private Byte type;
    private Integer expiretime;
    private Integer cuId;


    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getContent()
    {
        return content;
    }

    public void setContent(String content)
    {
        this.content = content;
    }

    public String getTime()
    {
        return time;
    }

    public void setTime(String time)
    {
        this.time = time;
    }

    public String getPictureIdList()
    {
        return pictureIdList;
    }

    public void setPictureIdList(String pictureIdList)
    {
        this.pictureIdList = pictureIdList;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public Byte getType()
    {
        return type;
    }

    public void setType(Byte type)
    {
        this.type = type;
    }

    public Integer getExpiretime()
    {
        return expiretime;
    }

    public void setExpiretime(Integer expiretime)
    {
        this.expiretime = expiretime;
    }

    public Integer getCuId()
    {
        return cuId;
    }

    public void setCuId(Integer cuId)
    {
        this.cuId = cuId;
    }

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }
}
