import javax.annotation.Resource;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hw.MyBean;

@RunWith(SpringJUnit4ClassRunner.class)  //ʹ��junit4���в���  
@ContextConfiguration   
({"/app*.xml"}) //���������ļ�  
  
//------------����������´��룬���м̳и���Ĳ����඼����ѭ�����ã�Ҳ���Բ��ӣ��ڲ�����ķ�����///�������񣬲μ���һ��ʵ��  
//����ǳ��ؼ���������������ע�����ã�������ƾͻ���ȫʧЧ��  
//@Transactional  
//�������������������ļ��е������������transactionManager = "transactionManager"����ͬʱ//ָ���Զ��ع���defaultRollback = true�������������������ݲŲ�����Ⱦ���ݿ⣡  
//@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)  
//------------  
public class BaseJunit4Test {  
	@Resource
	MyBean mb;
	
	@org.junit.Test
	public void test(){
		System.out.println(mb.getMessage());
	}
} 