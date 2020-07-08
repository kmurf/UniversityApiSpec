package ie.kevmurf.oas.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProfessorApiSpec
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-07-08T20:12:12.521+01:00[Europe/London]")


public class ProfessorApiSpec   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("classIds")
  @Valid
  private List<Integer> classIds = null;

  public ProfessorApiSpec id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  
    public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public ProfessorApiSpec name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProfessorApiSpec classIds(List<Integer> classIds) {
    this.classIds = classIds;
    return this;
  }

  public ProfessorApiSpec addClassIdsItem(Integer classIdsItem) {
    if (this.classIds == null) {
      this.classIds = new ArrayList<Integer>();
    }
    this.classIds.add(classIdsItem);
    return this;
  }

  /**
   * Get classIds
   * @return classIds
  **/
  @ApiModelProperty(value = "")
  
    public List<Integer> getClassIds() {
    return classIds;
  }

  public void setClassIds(List<Integer> classIds) {
    this.classIds = classIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProfessorApiSpec professorApiSpec = (ProfessorApiSpec) o;
    return Objects.equals(this.id, professorApiSpec.id) &&
        Objects.equals(this.name, professorApiSpec.name) &&
        Objects.equals(this.classIds, professorApiSpec.classIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, classIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfessorApiSpec {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    classIds: ").append(toIndentedString(classIds)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
