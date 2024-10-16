package com.lamld.supportmanualtest.server.entities;

import com.lamld.supportmanualtest.server.data.pojo.JsonInfo;
import com.lamld.supportmanualtest.server.data.pojo.KeyValue;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@Entity
@Table(name = "test_api", schema = "support-manual-test-db")
@AttributeOverrides({
    @AttributeOverride(name = "createdAt", column = @Column(name = "created_at")),
    @AttributeOverride(name = "updatedAt", column = @Column(name = "updated_at"))
})
public class TestApi extends BaseEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Integer id;

  @NotNull
  @Column(name = "project_id", nullable = false)
  private Integer projectId;

  @Size(max = 255)
  @Column(name = "api_name")
  private String apiName;

  @NotNull
  @Column(name = "method", nullable = false, length = 50)
  private String method;

  @Size(max = 1000)
  @Column(name = "description", length = 1000)
  private String description;

  @Column(name = "param")
  @JdbcTypeCode(SqlTypes.JSON)
  private List<KeyValue> param;

  @Column(name = "body")
  @JdbcTypeCode(SqlTypes.JSON)
  private JsonInfo body;

  @Column(name = "header")
  @JdbcTypeCode(SqlTypes.JSON)
  private List<KeyValue> header;

  @NotNull
  @Column(name = "account_id", nullable = false)
  private Integer accountId;

  @Size(max = 500)
  @Column(name = "path", length = 500)
  private String path;

  @Column(name = "path_variable")
  @JdbcTypeCode(SqlTypes.JSON)
  private List<KeyValue> pathVariable;

}