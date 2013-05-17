/**
 * $Id: MQConsumer.java 1831 2013-05-16 01:39:51Z shijia.wxr $
 */
package com.alibaba.rocketmq.client.consumer;

import java.util.List;

import com.alibaba.rocketmq.client.MQAdmin;
import com.alibaba.rocketmq.client.exception.MQClientException;
import com.alibaba.rocketmq.common.MessageExt;
import com.alibaba.rocketmq.common.MessageQueue;


/**
 * @author vintage.wang@gmail.com shijia.wxr@taobao.com
 * 
 */
public interface MQConsumer extends MQAdmin {
    /**
     * Consumer����ʧ�ܵ���Ϣ����ѡ�����·��ص��������ˣ�����ʱ����<br>
     * �����ȳ��Խ���Ϣ���ص���Ϣ֮ǰ�洢����������ʱֻ������ϢOffset����Ϣ�岻���ͣ�����ռ���������<br>
     * �������ʧ�ܣ����Զ����Է���������������ʱ��Ϣ��Ҳ�ᴫ��<br>
     * �ش���ȥ����Ϣֻ�ᱻ��ǰConsumer Group���ѡ�
     * 
     * @param msg
     * @param mq
     * @param delayLevel
     */
    public void sendMessageBack(final MessageExt msg, final MessageQueue mq, final int delayLevel);


    /**
     * ����topic��ȡ��Ӧ��MetaQueue���ǿɱ����ĵĶ���
     * 
     * @param topic
     *            ��ϢTopic
     * @return ���ض��м���
     * @throws MQClientException
     */
    public List<MessageQueue> fetchSubscribeMessageQueues(final String topic) throws MQClientException;

}