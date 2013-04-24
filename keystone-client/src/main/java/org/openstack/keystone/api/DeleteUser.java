package org.openstack.keystone.api;

import org.openstack.base.client.HttpMethod;
import org.openstack.base.client.OpenStackClient;
import org.openstack.base.client.OpenStackCommand;
import org.openstack.base.client.OpenStackRequest;

public class DeleteUser implements OpenStackCommand<Void> {

	private String id;
	
	public DeleteUser(String id) {
		this.id = id;
	}

	public OpenStackRequest execute(OpenStackClient client) {
		OpenStackRequest request = new OpenStackRequest();
		request.method(HttpMethod.DELETE);
	    request.path("/users/").path(id);
	    request.header("Accept", "application/json");
		return request;
	}
	
}
