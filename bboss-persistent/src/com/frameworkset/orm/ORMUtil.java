/*
 *  Copyright 2008 biaoping.yin
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.  
 */
package com.frameworkset.orm;

import java.util.Set;

import com.frameworkset.common.poolman.DBUtil;

/**
 * <p>Title: ʵ�����ݿ��¼�����ת������</p>
 *
 * <p>Description: ʵ�ִ�������롢ɾ�����������ݿ����
 *                 ʵ��sql�����ҵ�����Ĳ�ѯ��������ѯ�������װ��ҵ�����ĸ�ʽ��װ��
 * </p>
 *
 * <p>
 * bboss workgroup
 * </p>
 * <p>
 * Copyright (c) 2007
 * </p>
 * 
 * @Date 2009-6-1 ����08:58:51
 * @author biaoping.yin
 * @version 1.0
 */
public class ORMUtil
    extends DBUtil {
    public ORMUtil() {

    }

    /**
     * ��װ���ݵĶ����Class����
     * ִ�в�ѯ����ʱ����ֱ�ӽ����صĽ������װ��һ�����������Ͷ�����б���ʹ��
     * @param dbName String ���ݿ����ӳص�����
     * @param newObj Object �����¼���ݷ�װ����
     * @return Object ����Զ��������ݿ������򷵻����ݿ�����
     */

    public Object executeInsert(String dbName,Object newObj) throws ORMappingException
    {
        return null;
    }

    /**
     * ��װ���ݵĶ����Class����
     * ִ�в�ѯ����ʱ����ֱ�ӽ����صĽ������װ��һ�����������Ͷ�����б���ʹ��
     * @param newObj Object �����¼���ݷ�װ����
     * @return Object ����Զ��������ݿ������򷵻����ݿ�����
     */

    public Object executeInsert(Object newObj) throws ORMappingException
    {
        //����ȱʡ�����ݿ����ӳ�
        return executeInsert(null,newObj);
    }

    /**
     * �����������
     *
     * @param newObj Object �����¼���ݷ�װ����
     * @return Object ����Զ��������ݿ������򷵻����ݿ�����
     */

    public Object[] executeBatchInsert(Set newObj) throws ORMappingException
    {
        //����ȱʡ�����ݿ����ӳ�
        return executeBatchInsert(null,newObj);
    }

    /**
     * executeBatchInsert
     *
     * @param object Object
     * @param newObj Set
     * @return Object[]
     */
    private Object[] executeBatchInsert(String dbName, Set newObj) throws ORMappingException{
        return null;
    }


    /**
     * ���²���
     * @param dbName String ���ݿ����ӳص�����
     * @param newObj Object ���¼�¼���ݷ�װ����
     */

    public void executeUpdate(String dbName,Object newObj) throws ORMappingException
    {

    }

    /**
     * ���²���
     * @param newObj Object ���¼�¼���ݷ�װ����
     */

    public void executeUpdate(Object newObj) throws ORMappingException
    {
        //����ȱʡ�����ݿ����ӳ�
        executeUpdate(null,newObj);
    }

    /**
     * �������²���
     *
     * @param newObj Object ���������¼�¼���ݷ�װ����

     */

    public void executeBatchUpdate(Set newObj) throws ORMappingException
    {
        //����ȱʡ�����ݿ����ӳ�
        executeBatchUpdate(null,newObj);
    }

    /**
     * �������²���
     * @param dbName String ���ݿ����ӳص�����
     * @param newObj Set ���������¼�¼���ݷ�װ����
     */
    public void executeBatchUpdate(String dbName, Set newObj) throws ORMappingException{

    }

}