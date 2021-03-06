/*
 * Copyright (c) 2005-2014, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.wso2.andes.server.logging.subjects;

import org.wso2.andes.server.exchange.Exchange;
import org.wso2.andes.server.virtualhost.VirtualHost;
import static org.wso2.andes.server.logging.subjects.LogSubjectFormat.EXCHANGE_FORMAT;

public class ExchangeLogSubject extends AbstractLogSubject
{

    /** Create an ExchangeLogSubject that Logs in the following format. */
    public ExchangeLogSubject(Exchange exchange, VirtualHost vhost)
    {
        setLogStringWithFormat(EXCHANGE_FORMAT, vhost.getName(),
                               exchange.getTypeShortString(), exchange.getNameShortString());
    }
}
