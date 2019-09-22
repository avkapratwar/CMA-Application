/**
 * 
 */
package com.virtusa.cma.dao;




import com.virtusa.cma.entity.RegisterCourses;

/**
 * @author admin
 *
 */
public interface RegisterCoursesDaoIface {
	
	int enrollCourses(RegisterCourses c,String userName);
	
}
