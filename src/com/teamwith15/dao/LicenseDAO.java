package com.teamwith15.dao;

import java.util.List;

import com.teamwith15.dto.LicenseDTO;

public interface LicenseDAO {
	public int addLicense(LicenseDTO dto);

	public int updateLicense(LicenseDTO dto);

	public int removeLicense(String licenseId);

	public int removeLicenseByMember(String memberId);

	public List<LicenseDTO> searchLicense(String memberId);
	
	public List<LicenseDTO> searchAllLicense();
}
