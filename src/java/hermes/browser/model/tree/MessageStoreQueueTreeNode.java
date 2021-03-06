/* 
 * Copyright 2003,2004,2005 Colin Crist
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

package hermes.browser.model.tree;

import hermes.browser.IconCache;
import hermes.store.MessageStore;

import javax.jms.Queue;

/**
 * @author colincrist@hermesjms.com
 * @version $Id: MessageStoreQueueTreeNode.java,v 1.1 2005/07/15 15:11:01 colincrist Exp $
 */

public class MessageStoreQueueTreeNode extends MessageStoreDestinationTreeNode
{
   /**
	 * 
	 */
	private static final long serialVersionUID = 8772319873019540486L;

public MessageStoreQueueTreeNode(MessageStore store, String id, Queue bean)
   {
      super(store, id, bean);
      
      setIcon(IconCache.getIcon("jms.queue"));
   }

}
