/**
 * This class is generated by jOOQ
 */
package org.jooq.example.gradle.db.information_schema.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.5.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CrossReferencesRecord extends org.jooq.impl.TableRecordImpl<org.jooq.example.gradle.db.information_schema.tables.records.CrossReferencesRecord> implements org.jooq.Record14<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Short, java.lang.Short, java.lang.Short, java.lang.String, java.lang.String, java.lang.Short> {

	private static final long serialVersionUID = 885668655;

	/**
	 * Setter for <code>INFORMATION_SCHEMA.CROSS_REFERENCES.PKTABLE_CATALOG</code>.
	 */
	public void setPktableCatalog(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.CROSS_REFERENCES.PKTABLE_CATALOG</code>.
	 */
	public java.lang.String getPktableCatalog() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.CROSS_REFERENCES.PKTABLE_SCHEMA</code>.
	 */
	public void setPktableSchema(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.CROSS_REFERENCES.PKTABLE_SCHEMA</code>.
	 */
	public java.lang.String getPktableSchema() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.CROSS_REFERENCES.PKTABLE_NAME</code>.
	 */
	public void setPktableName(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.CROSS_REFERENCES.PKTABLE_NAME</code>.
	 */
	public java.lang.String getPktableName() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.CROSS_REFERENCES.PKCOLUMN_NAME</code>.
	 */
	public void setPkcolumnName(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.CROSS_REFERENCES.PKCOLUMN_NAME</code>.
	 */
	public java.lang.String getPkcolumnName() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.CROSS_REFERENCES.FKTABLE_CATALOG</code>.
	 */
	public void setFktableCatalog(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.CROSS_REFERENCES.FKTABLE_CATALOG</code>.
	 */
	public java.lang.String getFktableCatalog() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.CROSS_REFERENCES.FKTABLE_SCHEMA</code>.
	 */
	public void setFktableSchema(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.CROSS_REFERENCES.FKTABLE_SCHEMA</code>.
	 */
	public java.lang.String getFktableSchema() {
		return (java.lang.String) getValue(5);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.CROSS_REFERENCES.FKTABLE_NAME</code>.
	 */
	public void setFktableName(java.lang.String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.CROSS_REFERENCES.FKTABLE_NAME</code>.
	 */
	public java.lang.String getFktableName() {
		return (java.lang.String) getValue(6);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.CROSS_REFERENCES.FKCOLUMN_NAME</code>.
	 */
	public void setFkcolumnName(java.lang.String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.CROSS_REFERENCES.FKCOLUMN_NAME</code>.
	 */
	public java.lang.String getFkcolumnName() {
		return (java.lang.String) getValue(7);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.CROSS_REFERENCES.ORDINAL_POSITION</code>.
	 */
	public void setOrdinalPosition(java.lang.Short value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.CROSS_REFERENCES.ORDINAL_POSITION</code>.
	 */
	public java.lang.Short getOrdinalPosition() {
		return (java.lang.Short) getValue(8);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.CROSS_REFERENCES.UPDATE_RULE</code>.
	 */
	public void setUpdateRule(java.lang.Short value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.CROSS_REFERENCES.UPDATE_RULE</code>.
	 */
	public java.lang.Short getUpdateRule() {
		return (java.lang.Short) getValue(9);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.CROSS_REFERENCES.DELETE_RULE</code>.
	 */
	public void setDeleteRule(java.lang.Short value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.CROSS_REFERENCES.DELETE_RULE</code>.
	 */
	public java.lang.Short getDeleteRule() {
		return (java.lang.Short) getValue(10);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.CROSS_REFERENCES.FK_NAME</code>.
	 */
	public void setFkName(java.lang.String value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.CROSS_REFERENCES.FK_NAME</code>.
	 */
	public java.lang.String getFkName() {
		return (java.lang.String) getValue(11);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.CROSS_REFERENCES.PK_NAME</code>.
	 */
	public void setPkName(java.lang.String value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.CROSS_REFERENCES.PK_NAME</code>.
	 */
	public java.lang.String getPkName() {
		return (java.lang.String) getValue(12);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.CROSS_REFERENCES.DEFERRABILITY</code>.
	 */
	public void setDeferrability(java.lang.Short value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.CROSS_REFERENCES.DEFERRABILITY</code>.
	 */
	public java.lang.Short getDeferrability() {
		return (java.lang.Short) getValue(13);
	}

	// -------------------------------------------------------------------------
	// Record14 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row14<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Short, java.lang.Short, java.lang.Short, java.lang.String, java.lang.String, java.lang.Short> fieldsRow() {
		return (org.jooq.Row14) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row14<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Short, java.lang.Short, java.lang.Short, java.lang.String, java.lang.String, java.lang.Short> valuesRow() {
		return (org.jooq.Row14) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return org.jooq.example.gradle.db.information_schema.tables.CrossReferences.CROSS_REFERENCES.PKTABLE_CATALOG;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.jooq.example.gradle.db.information_schema.tables.CrossReferences.CROSS_REFERENCES.PKTABLE_SCHEMA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.jooq.example.gradle.db.information_schema.tables.CrossReferences.CROSS_REFERENCES.PKTABLE_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return org.jooq.example.gradle.db.information_schema.tables.CrossReferences.CROSS_REFERENCES.PKCOLUMN_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return org.jooq.example.gradle.db.information_schema.tables.CrossReferences.CROSS_REFERENCES.FKTABLE_CATALOG;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return org.jooq.example.gradle.db.information_schema.tables.CrossReferences.CROSS_REFERENCES.FKTABLE_SCHEMA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field7() {
		return org.jooq.example.gradle.db.information_schema.tables.CrossReferences.CROSS_REFERENCES.FKTABLE_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field8() {
		return org.jooq.example.gradle.db.information_schema.tables.CrossReferences.CROSS_REFERENCES.FKCOLUMN_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Short> field9() {
		return org.jooq.example.gradle.db.information_schema.tables.CrossReferences.CROSS_REFERENCES.ORDINAL_POSITION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Short> field10() {
		return org.jooq.example.gradle.db.information_schema.tables.CrossReferences.CROSS_REFERENCES.UPDATE_RULE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Short> field11() {
		return org.jooq.example.gradle.db.information_schema.tables.CrossReferences.CROSS_REFERENCES.DELETE_RULE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field12() {
		return org.jooq.example.gradle.db.information_schema.tables.CrossReferences.CROSS_REFERENCES.FK_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field13() {
		return org.jooq.example.gradle.db.information_schema.tables.CrossReferences.CROSS_REFERENCES.PK_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Short> field14() {
		return org.jooq.example.gradle.db.information_schema.tables.CrossReferences.CROSS_REFERENCES.DEFERRABILITY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getPktableCatalog();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getPktableSchema();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getPktableName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getPkcolumnName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getFktableCatalog();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getFktableSchema();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value7() {
		return getFktableName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value8() {
		return getFkcolumnName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Short value9() {
		return getOrdinalPosition();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Short value10() {
		return getUpdateRule();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Short value11() {
		return getDeleteRule();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value12() {
		return getFkName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value13() {
		return getPkName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Short value14() {
		return getDeferrability();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CrossReferencesRecord value1(java.lang.String value) {
		setPktableCatalog(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CrossReferencesRecord value2(java.lang.String value) {
		setPktableSchema(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CrossReferencesRecord value3(java.lang.String value) {
		setPktableName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CrossReferencesRecord value4(java.lang.String value) {
		setPkcolumnName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CrossReferencesRecord value5(java.lang.String value) {
		setFktableCatalog(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CrossReferencesRecord value6(java.lang.String value) {
		setFktableSchema(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CrossReferencesRecord value7(java.lang.String value) {
		setFktableName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CrossReferencesRecord value8(java.lang.String value) {
		setFkcolumnName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CrossReferencesRecord value9(java.lang.Short value) {
		setOrdinalPosition(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CrossReferencesRecord value10(java.lang.Short value) {
		setUpdateRule(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CrossReferencesRecord value11(java.lang.Short value) {
		setDeleteRule(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CrossReferencesRecord value12(java.lang.String value) {
		setFkName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CrossReferencesRecord value13(java.lang.String value) {
		setPkName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CrossReferencesRecord value14(java.lang.Short value) {
		setDeferrability(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CrossReferencesRecord values(java.lang.String value1, java.lang.String value2, java.lang.String value3, java.lang.String value4, java.lang.String value5, java.lang.String value6, java.lang.String value7, java.lang.String value8, java.lang.Short value9, java.lang.Short value10, java.lang.Short value11, java.lang.String value12, java.lang.String value13, java.lang.Short value14) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached CrossReferencesRecord
	 */
	public CrossReferencesRecord() {
		super(org.jooq.example.gradle.db.information_schema.tables.CrossReferences.CROSS_REFERENCES);
	}

	/**
	 * Create a detached, initialised CrossReferencesRecord
	 */
	public CrossReferencesRecord(java.lang.String pktableCatalog, java.lang.String pktableSchema, java.lang.String pktableName, java.lang.String pkcolumnName, java.lang.String fktableCatalog, java.lang.String fktableSchema, java.lang.String fktableName, java.lang.String fkcolumnName, java.lang.Short ordinalPosition, java.lang.Short updateRule, java.lang.Short deleteRule, java.lang.String fkName, java.lang.String pkName, java.lang.Short deferrability) {
		super(org.jooq.example.gradle.db.information_schema.tables.CrossReferences.CROSS_REFERENCES);

		setValue(0, pktableCatalog);
		setValue(1, pktableSchema);
		setValue(2, pktableName);
		setValue(3, pkcolumnName);
		setValue(4, fktableCatalog);
		setValue(5, fktableSchema);
		setValue(6, fktableName);
		setValue(7, fkcolumnName);
		setValue(8, ordinalPosition);
		setValue(9, updateRule);
		setValue(10, deleteRule);
		setValue(11, fkName);
		setValue(12, pkName);
		setValue(13, deferrability);
	}
}
