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
 * ClassApiSpec
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-07-08T20:12:08.472+01:00[Europe/London]")


public class ClassApiSpec   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("professorId")
  private Integer professorId = null;

  @JsonProperty("studentIds")
  @Valid
  private List<Integer> studentIds = null;

  public ClassApiSpec id(Integer id) {
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

  public ClassApiSpec name(String name) {
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

  public ClassApiSpec professorId(Integer professorId) {
    this.professorId = professorId;
    return this;
  }

  /**
   * Get professorId
   * @return professorId
  **/
  @ApiModelProperty(value = "")
  
    public Integer getProfessorId() {
    return professorId;
  }

  public void setProfessorId(Integer professorId) {
    this.professorId = professorId;
  }

  public ClassApiSpec studentIds(List<Integer> studentIds) {
    this.studentIds = studentIds;
    return this;
  }

  public ClassApiSpec addStudentIdsItem(Integer studentIdsItem) {
    if (this.studentIds == null) {
      this.studentIds = new ArrayList<Integer>();
    }
    this.studentIds.add(studentIdsItem);
    return this;
  }

  /**
   * Get studentIds
   * @return studentIds
  **/
  @ApiModelProperty(value = "")
  
    public List<Integer> getStudentIds() {
    return studentIds;
  }

  public void setStudentIds(List<Integer> studentIds) {
    this.studentIds = studentIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClassApiSpec classApiSpec = (ClassApiSpec) o;
    return Objects.equals(this.id, classApiSpec.id) &&
        Objects.equals(this.name, classApiSpec.name) &&
        Objects.equals(this.professorId, classApiSpec.professorId) &&
        Objects.equals(this.studentIds, classApiSpec.studentIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, professorId, studentIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClassApiSpec {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    professorId: ").append(toIndentedString(professorId)).append("\n");
    sb.append("    studentIds: ").append(toIndentedString(studentIds)).append("\n");
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
