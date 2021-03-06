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

package hermes.swing;

import java.net.URL;

import javax.swing.JLabel;

/**
 * @author colincrist@hermesjms.com
 * @version $Id: URLLabel.java,v 1.1 2006/05/13 14:06:55 colincrist Exp $
 */

public class URLLabel extends JLabel
{
   /**
	 * 
	 */
	private static final long serialVersionUID = -1795585156383512660L;
private URL url ;
   
   public URLLabel(String label, URL url) 
   {
      super(label) ;
      this.url = url ;
   }
   
   public URL getURL()
   {
      return url ;
   }
   
   public String toString()
   {
      return getText() ;
   }
}
