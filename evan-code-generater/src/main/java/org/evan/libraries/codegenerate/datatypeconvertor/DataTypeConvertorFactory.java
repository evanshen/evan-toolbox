package org.evan.libraries.codegenerate.datatypeconvertor;

import org.evan.libraries.codegenerate.model.OrmCreatorParam;

/**
 * 数据类型转换器
 * <p>
 * 
 * @author <a href="mailto:shenw@hundsun.com">Evan.Shen</a>
 * @version 2011-4-22 下午10:57:31
 */
public class DataTypeConvertorFactory {
	public static DataTypeConvertor getDataTypeConvertor(OrmCreatorParam.DatabaseType database) {
		if (OrmCreatorParam.DatabaseType.oracle.equals(database)) {
			return new OracleDefaultDataTypeConvertor();
		} else if (OrmCreatorParam.DatabaseType.mysql.equals(database)) {
			return new MysqlDefaultDataTypeConvertor();
		} else {
			throw new IllegalStateException("databaseType is null");
		}
	}
}
