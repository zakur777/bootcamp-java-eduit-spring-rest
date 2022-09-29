package ar.com.eduducactionit.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "name",
        "total_items_in_this_category"
})
public class ChildCategoriesMeliDTO {
    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("total_items_in_this_category")
    private Integer totalItemsInThisCategory;

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

    @JsonProperty("total_items_in_this_category")
    public Integer getTotalItemsInThisCategory() {
        return totalItemsInThisCategory;
    }

    @JsonProperty("total_items_in_this_category")
    public void setTotalItemsInThisCategory(Integer totalItemsInThisCategory) {
        this.totalItemsInThisCategory = totalItemsInThisCategory;
    }
}
