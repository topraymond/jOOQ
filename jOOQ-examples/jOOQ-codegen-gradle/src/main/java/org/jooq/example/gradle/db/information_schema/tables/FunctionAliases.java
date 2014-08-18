/**
 * This class is generated by jOOQ
 */
package org.jooq.example.gradle.db.information_schema.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.5.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FunctionAliases extends org.jooq.impl.TableImpl<org.jooq.example.gradle.db.information_schema.tables.records.FunctionAliasesRecord> {

	private static final long serialVersionUID = -240329503;

	/**
	 * The singleton instance of <code>INFORMATION_SCHEMA.FUNCTION_ALIASES</code>
	 */
	public static final org.jooq.example.gradle.db.information_schema.tables.FunctionAliases FUNCTION_ALIASES = new org.jooq.example.gradle.db.information_schema.tables.FunctionAliases();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.example.gradle.db.information_schema.tables.records.FunctionAliasesRecord> getRecordType() {
		return org.jooq.example.gradle.db.information_schema.tables.records.FunctionAliasesRecord.class;
	}

	/**
	 * The column <code>INFORMATION_SCHEMA.FUNCTION_ALIASES.ALIAS_CATALOG</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.FunctionAliasesRecord, java.lang.String> ALIAS_CATALOG = createField("ALIAS_CATALOG", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.FUNCTION_ALIASES.ALIAS_SCHEMA</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.FunctionAliasesRecord, java.lang.String> ALIAS_SCHEMA = createField("ALIAS_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.FUNCTION_ALIASES.ALIAS_NAME</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.FunctionAliasesRecord, java.lang.String> ALIAS_NAME = createField("ALIAS_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.FUNCTION_ALIASES.JAVA_CLASS</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.FunctionAliasesRecord, java.lang.String> JAVA_CLASS = createField("JAVA_CLASS", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.FUNCTION_ALIASES.JAVA_METHOD</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.FunctionAliasesRecord, java.lang.String> JAVA_METHOD = createField("JAVA_METHOD", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.FUNCTION_ALIASES.DATA_TYPE</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.FunctionAliasesRecord, java.lang.Integer> DATA_TYPE = createField("DATA_TYPE", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.FUNCTION_ALIASES.TYPE_NAME</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.FunctionAliasesRecord, java.lang.String> TYPE_NAME = createField("TYPE_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.FUNCTION_ALIASES.COLUMN_COUNT</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.FunctionAliasesRecord, java.lang.Integer> COLUMN_COUNT = createField("COLUMN_COUNT", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.FUNCTION_ALIASES.RETURNS_RESULT</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.FunctionAliasesRecord, java.lang.Short> RETURNS_RESULT = createField("RETURNS_RESULT", org.jooq.impl.SQLDataType.SMALLINT, this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.FUNCTION_ALIASES.REMARKS</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.FunctionAliasesRecord, java.lang.String> REMARKS = createField("REMARKS", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.FUNCTION_ALIASES.ID</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.FunctionAliasesRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.FUNCTION_ALIASES.SOURCE</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.FunctionAliasesRecord, java.lang.String> SOURCE = createField("SOURCE", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * Create a <code>INFORMATION_SCHEMA.FUNCTION_ALIASES</code> table reference
	 */
	public FunctionAliases() {
		this("FUNCTION_ALIASES", null);
	}

	/**
	 * Create an aliased <code>INFORMATION_SCHEMA.FUNCTION_ALIASES</code> table reference
	 */
	public FunctionAliases(java.lang.String alias) {
		this(alias, org.jooq.example.gradle.db.information_schema.tables.FunctionAliases.FUNCTION_ALIASES);
	}

	private FunctionAliases(java.lang.String alias, org.jooq.Table<org.jooq.example.gradle.db.information_schema.tables.records.FunctionAliasesRecord> aliased) {
		this(alias, aliased, null);
	}

	private FunctionAliases(java.lang.String alias, org.jooq.Table<org.jooq.example.gradle.db.information_schema.tables.records.FunctionAliasesRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.jooq.example.gradle.db.information_schema.InformationSchema.INFORMATION_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.example.gradle.db.information_schema.tables.FunctionAliases as(java.lang.String alias) {
		return new org.jooq.example.gradle.db.information_schema.tables.FunctionAliases(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.jooq.example.gradle.db.information_schema.tables.FunctionAliases rename(java.lang.String name) {
		return new org.jooq.example.gradle.db.information_schema.tables.FunctionAliases(name, null);
	}
}
