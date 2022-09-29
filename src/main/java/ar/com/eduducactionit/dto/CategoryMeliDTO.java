package ar.com.eduducactionit.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "name",
        "picture",
        "permalink",
        "total_items_in_this_category",
        "path_from_root",
        "children_categories",
        "attribute_types",
        "settings",
        "channels_settings",
        "meta_categ_id",
        "attributable",
        "date_created"
})
public class CategoryMeliDTO {
    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("picture")
    private String picture;
    @JsonProperty("permalink")
    private String permalink;
    @JsonProperty("total_items_in_this_category")
    private Integer totalItemsInThisCategory;
    @JsonProperty("path_from_root")
    private List<PathFromRootMeliDTO> pathFromRoot = null;
    @JsonProperty("children_categories")
    private List<ChildCategoriesMeliDTO> childrenCategories = null;
    @JsonProperty("attribute_types")
    private String attributeTypes;
    @JsonProperty("settings")
    private SettingsMeliDTO settings;
    @JsonProperty("channels_settings")
    private List<Object> channelsSettings = null;
    @JsonProperty("meta_categ_id")
    private Object metaCategId;
    @JsonProperty("attributable")
    private Boolean attributable;
    @JsonProperty("date_created")
    private String dateCreated;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("picture")
    public String getPicture() {
        return picture;
    }

    @JsonProperty("picture")
    public void setPicture(String picture) {
        this.picture = picture;
    }

    @JsonProperty("permalink")
    public String getPermalink() {
        return permalink;
    }

    @JsonProperty("permalink")
    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }

    @JsonProperty("total_items_in_this_category")
    public Integer getTotalItemsInThisCategory() {
        return totalItemsInThisCategory;
    }

    @JsonProperty("total_items_in_this_category")
    public void setTotalItemsInThisCategory(Integer totalItemsInThisCategory) {
        this.totalItemsInThisCategory = totalItemsInThisCategory;
    }

    @JsonProperty("path_from_root")
    public List<PathFromRootMeliDTO> getPathFromRoot() {
        return pathFromRoot;
    }

    @JsonProperty("path_from_root")
    public void setPathFromRoot(List<PathFromRootMeliDTO> pathFromRoot) {
        this.pathFromRoot = pathFromRoot;
    }

    @JsonProperty("children_categories")
    public List<ChildCategoriesMeliDTO> getChildrenCategories() {
        return childrenCategories;
    }

    @JsonProperty("children_categories")
    public void setChildrenCategories(List<ChildCategoriesMeliDTO> childrenCategories) {
        this.childrenCategories = childrenCategories;
    }

    @JsonProperty("attribute_types")
    public String getAttributeTypes() {
        return attributeTypes;
    }

    @JsonProperty("attribute_types")
    public void setAttributeTypes(String attributeTypes) {
        this.attributeTypes = attributeTypes;
    }

    @JsonProperty("settings")
    public SettingsMeliDTO getSettings() {
        return settings;
    }

    @JsonProperty("settings")
    public void setSettings(SettingsMeliDTO settings) {
        this.settings = settings;
    }

    @JsonProperty("channels_settings")
    public List<Object> getChannelsSettings() {
        return channelsSettings;
    }

    @JsonProperty("channels_settings")
    public void setChannelsSettings(List<Object> channelsSettings) {
        this.channelsSettings = channelsSettings;
    }

    @JsonProperty("meta_categ_id")
    public Object getMetaCategId() {
        return metaCategId;
    }

    @JsonProperty("meta_categ_id")
    public void setMetaCategId(Object metaCategId) {
        this.metaCategId = metaCategId;
    }

    @JsonProperty("attributable")
    public Boolean getAttributable() {
        return attributable;
    }

    @JsonProperty("attributable")
    public void setAttributable(Boolean attributable) {
        this.attributable = attributable;
    }

    @JsonProperty("date_created")
    public String getDateCreated() {
        return dateCreated;
    }

    @JsonProperty("date_created")
    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }
}
