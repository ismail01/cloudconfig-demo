package com.example.configdemo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "properties")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConfigData implements Serializable{

	@Id
	private int id;
	private String key;
}
