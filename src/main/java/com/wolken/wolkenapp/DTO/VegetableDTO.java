package com.wolken.wolkenapp.DTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@NamedQueries(value = {  
@NamedQuery(name="selectAll",query="from VegetableDTO "),
@NamedQuery(name="updateById",query="update VegetableDTO vegDTO set vegDTO.vegetableName=:vegName where vegDTO.vegetableId=: vegId"),
@NamedQuery(name="deleteById",query="delete from VegetableDTO vegDTO where vegDTO.vegetableId=:vegId ")
})


@Entity
@ToString
@Table(name = "vegetable_table")
public class VegetableDTO {
	@Id
	@Column(name = "vegetable_id")
	private int vegetableId;
	
	@Column(name = "vegetable_name")
	private String vegetableName;
	
	@Column(name = "vegetable_color")
	private String vegetableColor;

}
