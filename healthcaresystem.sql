-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 10, 2022 at 10:14 AM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `healthcaresystem`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `admin_id` int(11) NOT NULL,
  `admin_login_name` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `admin_name` varchar(50) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `date_of_birth` date NOT NULL,
  `mail` varchar(100) NOT NULL,
  `phone` varchar(20) NOT NULL,
  `blood_type` varchar(10) NOT NULL,
  `address` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`admin_id`, `admin_login_name`, `password`, `admin_name`, `gender`, `date_of_birth`, `mail`, `phone`, `blood_type`, `address`) VALUES
(1, 'juejue', '6c49cdb2723d2e7a6314421227503049', 'Jue Eaint Phue', 'Female', '2022-10-05', 'jue@gmail.com', '09456123789', 'AB', 'Mandalay');

-- --------------------------------------------------------

--
-- Table structure for table `department`
--

CREATE TABLE `department` (
  `department_id` int(11) NOT NULL,
  `department_name` varchar(255) NOT NULL,
  `department_description` text NOT NULL,
  `status` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `department`
--

INSERT INTO `department` (`department_id`, `department_name`, `department_description`, `status`) VALUES
(1, 'Heart (Cardiology & Intervention)', 'Our Cardiology Department is one of the leading cardiac care providers in the country?s only JCIA hospital, PHSH. Our department is managed by a team of dedicated and experienced consultant cardiologists, supported by a full-time junior registrar team. The cardiology department provides a broad range of screening, early diagnosis, clinical management and rehabilitation/education of heart diseases.\r\nWith our team, you are in safe hands in case of a heart attack as our internationally recognized interventional cardiologists are available round the clock. Our 24/7 fully equipped ambulance service ?Hospital-on-wheels? will ensure you will receive the most appropriate treatment in a timely and efficient manner.\r\nWe provide a wide range of services from preventive to curative measures:\r\nCardiac Check-up Packages\r\n24/7 Chest Pain Clinic\r\nEchocardiogram\r\nTreadmill ECG\r\nCoronary Calcium Score\r\nCT Coronary Angiogram\r\nCoronary Angiogram\r\nPercutaneous Coronary Intervention (PCI)\r\nPrimary PCI\r\nHolter ECG\r\nPacemaker\r\nCardiac Resynchronization Therapy (CRT)\r\nImplantable Cardioverter Defibrillator (ICD)', 'available'),
(3, 'Liver (HPB & LIVER SURGERY)', 'The Hepatobiliary Department specializes in the diagnosis and treatment of conditions liver, bile ducts or gall bladder.\r\nOur consultants have a wide range of specialist expertise and work in a multidisciplinary fashion to provide integrated care for patients and their families. The department provides each patient with a thorough, timely, cost-effective evaluation of his or her liver and biliary disorder and delivers specific care based on his or her needs.', 'unavailable'),
(4, 'Dental (Oral & Maxillofacial )', 'Oral and maxillofacial surgery is concerned with the treatment of conditions of the face, mouth and jaw. This includes repair of cleft lip/palate, facial trauma and surgery for cancer.\r\nOur consultants treat a range of conditions, including facial injuries, head and neck cancers, salivary gland diseases, facial deformities, facial palsies, facial pain, facial skin lesions, impacted teeth, cysts and tumours of the jaws, as well as mouth ulcers and infections.\r\nThe department currently offers the below treatments:\r\nOral and maxillofacial infections,\r\nImpacted wisdom teeth removal,\r\nDental and maxillofacial trauma,\r\nSurgery for oral and maxillofacial pathology,\r\nSurgery for pre-cancer and oral cancer,\r\nSalivary gland diseases,\r\nSurgery for neck metastasis,\r\nCleft lip and palate surgery,\r\nTemporomandibular joint (TMJ) disorders,\r\nSurgical correction of jaw.', 'available'),
(9, 'Urinary & Reproductive System (Urology)', 'The urology department is a well-known provider of urological services in the Hlaing Thar Yar region. Our medical team with excellent credentials emphasises the delivery of specialised medical and surgical care in all major aspects of urology. We offer comprehensive diagnostic and treatment options for a broad range of urological conditions, such as cystoscopy with insertion or removal of ureteral stent, urinary incontinence, benign prostatic hyperplasia (BPH), stones in the Urinary Tract, and kidney dysfunction.\r\nWe are committed to offering the highest clinical governance standards and patient-centred care by incorporating the latest advancements in Cystoscopy with insertion or removal of ureteral stent, Urinary incontinence, Urethral dilation, Urethral calibration, Catheterization, Transurethral resection of the prostate, Stone removal procedures, Bladder neck reconstruction, etc.', 'available'),
(10, 'Brain & Nerves Neurology', 'Neuroscience Department provides seamless healthcare system with continuum of clinical management for neurological and neurosurgical patients through multidisplinary teamwork comprising medical doctors, nurses, allied health care workers, rehabilitation staffs and supported by dedicated administrators. Our vision is to deliver international standard quality neurosurgical services and skills using modern neurosurgical equipment and state of art medical technology, minimize morbidity and mortality with satisfaction and appreciation by patients? family members.\r\n\r\n?We provide a wide-range of healthcare expertise for outpatients, inpatients for the following conditions:\r\n\r\nHead Injuries and Traumas\r\nBrain Hemorrhage\r\nStroke\r\nBrain Tumors\r\nSpinal Tumors\r\nProlapsed intervertebral disc\r\nDegenerated disc disease\r\nBack Pain\r\nNeck Pain\r\nShoulder Pain\r\nHeadache\r\nWeakness of arms and limbs\r\nOne sided facial pain and spasm\r\nInfections related to brain and spinal cord', 'unavailable'),
(15, 'Bones (Orthopaedics)', 'The Department of Orthopedic is dedicated to provide comprehensive services \r\nfor patients with musculoskeletal problems. Orthopedic Department is dedicated\r\nto deliver international standard and high quality care using modern equipment and\r\n technology in Orthopedics and Traumatology. We are the one stop orthopedic center with \r\ncomprehensive rehabilitation facility to help you get back to your normal daily function within 7 to 10 days.\r\nAll types of fracture fixation\r\nArthroscopic surgery\r\nArthroplasty (Total Knee and Total Hip Replacement, Shoulder and Elbow Arthroplasty, Revision Arthroplasty Procedures)\r\nSpinal Surgery (Discectomy, Laminectomy, Laminoplasty, Nucleoplasty, Fusion Surgery, Total Disc Replacement for whole spine, etc)\r\nMinimally Invasive Trauma and Spinal Operations\r\nDeformity Correction Operations\r\nOperations for Pediatric Orthopedic Problems', 'available'),
(20, 'Emergency Medicine', 'The Emergency Department (ED or A&E) at Sengkang General Hospital provides 24-hour service for all medical emergencies. This includes medical attention for all trauma, non-trauma surgical and medical emergencies. At SKH, we understand how important it is to have access to timely medical attention in the case of an emergency, which is why our emergency department is robust, well-trained and committed to providing an effective emergency medical service to all patients. At SKH, we are a 24-hour centre that takes pride in working with a comprehensive list of dedicated in-house specialists to coordinate and administer evidence-based quality treatment for all medical and surgical emergencies. These emergencies include potentially life-threatening conditions, i.e., heart attacks, strokes, major trauma and acute burns, infections. Our healthcare team are committed to providing the best possible emergency care?safely and effectively. We have taken unprecedented steps to ensure that visits to our hospital?s Emergency Department are welcoming and safe. Your health is our top priority. When you arrive at our emergency department, your symptoms and medical condition will be promptly assessed by an experienced emergency nurse who will determine how high of a priority you are compared to the other current medical emergencies. It is important to note that priority of care is not based on the time of arrival but on the severity or potential severity of your condition worsening if not treated early. If, after your assessment, we determine that you are a non-emergent patient, please be advised that you might have to wait an average of more than 4 hours to be attended to by a doctor. If you require urgent but non-emergency medical attention, we strongly advise you to visit your GP or a nearby medical care facility for an initial assessment of your condition.', 'available');

-- --------------------------------------------------------

--
-- Table structure for table `doctor`
--

CREATE TABLE `doctor` (
  `doctor_id` int(11) NOT NULL,
  `doctor_login_name` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `doctor_name` varchar(50) NOT NULL,
  `department` int(11) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `date_of_birth` date NOT NULL,
  `degree` varchar(100) NOT NULL,
  `doctor_biography` text DEFAULT NULL,
  `mail` varchar(100) NOT NULL,
  `phone` varchar(20) NOT NULL,
  `blood_type` varchar(10) DEFAULT NULL,
  `address` varchar(255) NOT NULL,
  `status` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `doctor`
--

INSERT INTO `doctor` (`doctor_id`, `doctor_login_name`, `password`, `doctor_name`, `department`, `gender`, `date_of_birth`, `degree`, `doctor_biography`, `mail`, `phone`, `blood_type`, `address`, `status`) VALUES
(1, 'drmyat@heart', '1bcc9eaf6ec712b2ca497983960b4f29', 'Myat Noe', 1, 'Female', '1953-05-05', 'Ph.D', 'Dr. Myat Noe obtained her medical degree at Thomas Jefferson University in Philadelphia. Her residency was at Thomas Jefferson and its												affiliated Wills Ear Hospital, and he completed his training with fellowships at the University of Connecticut in cataract and corneal surgery.', 'myat@gmail.com', '+959951234567', 'B', 'Mandalay', 'available'),
(2, 'drkyawSwar@liver', '1bcc9eaf6ec712b2ca497983960b4f29', 'U Kyaw Swar Oo', 3, 'Male', '1965-04-19', 'Ph.D', '', 'kyaw@gmail.com', '09794567319', 'A', 'Pwin Oo Lwin', 'unavailable'),
(3, 'khinPhyu@dental', '1bcc9eaf6ec712b2ca497983960b4f29', 'Daw Khin Phyu', 4, 'Female', '1974-10-10', 'Ph.D', '', 'khin@gmail.com', '09254316210', 'AB', 'Mandalay', 'available'),
(4, 'aung@dental', '1bcc9eaf6ec712b2ca497983960b4f29', 'U Aung Myint', 4, 'Male', '1986-07-23', 'M.B.B.S', '', 'aung18myint@gmail.com', '09972036379', 'O+', 'Mandalay', 'available'),
(5, 'yamin@urinary', '1bcc9eaf6ec712b2ca497983960b4f29', 'Daw Yamin Phyu Phyu', 9, 'Female', '1975-03-04', 'Ph.D', 'Graduated at 1988', 'phyu@gmail.com', '09256140', 'O', 'Mandalay', 'available'),
(6, 'aungko@urinary', '1bcc9eaf6ec712b2ca497983960b4f29', 'U Aung Ko Win', 9, 'Male', '1972-03-04', 'Ph.D', '', 'aung@gmail.com', '+959789123456', 'O', 'Yangon', 'available'),
(7, 'hlamyo@heart', '1bcc9eaf6ec712b2ca497983960b4f29', 'U Hla Myo', 1, 'Male', '1970-08-05', 'Ph.D', 'U Hla Myo is a retired professor who worked at Imperial College London. He is best known for his work in repairing heart valves, a procedure which came to be known as the Ross-Yacoub procedure. In 1983, he performed the United Kingdom\'s first combined lung and heart transplant. Also a humanitarian, Yacoub co-founded the Magdi Yacoub Global Heart Foundation in 2008.', 'myo@gmail.com', '09256183992', 'O', 'Mandalay', 'available'),
(8, 'htar@liver', '1bcc9eaf6ec712b2ca497983960b4f29', 'Daw Htar Htet Htet', 3, 'Female', '1988-12-01', 'Ph.D', '', 'htar@gmail.com', '09794561492', 'AB', 'Yangon', 'unavailable'),
(9, 'naing@heart', '1bcc9eaf6ec712b2ca497983960b4f29', 'Naing Naing Oo', 1, 'Female', '1990-08-01', 'M.B.B.S', '', 'mama@gamil.com', '09123456789', 'O', 'Mandalay', 'available'),
(10, 'hlahla@bones', '1bcc9eaf6ec712b2ca497983960b4f29', 'Hla Hla', 15, 'Female', '1990-08-01', 'M.B.B.S', '', 'hlahal@gamil.com', '09123456789', 'O', 'Mandalay', 'available'),
(11, 'kuku@bones', '1bcc9eaf6ec712b2ca497983960b4f29', 'Ku Ku', 15, 'Male', '1970-08-05', 'Ph.D', 'U Hla Myo is a retired professor who worked at Imperial College London. He is best known for his work in repairing heart valves, a procedure which came to be known as the Ross-Yacoub procedure. In 1983, he performed the United Kingdom\'s first combined lung and heart transplant. Also a humanitarian, Yacoub co-founded the Magdi Yacoub Global Heart Foundation in 2008.', 'kuku@gmail.com', '09256183992', 'O', 'Mandalay', 'unavailable'),
(14, 'umyintkyaw12@heart', '1bcc9eaf6ec712b2ca497983960b4f29', 'U Myint Kyaw', 1, 'Male', '1980-05-09', 'Ph.D', 'U Myint Kyaw is a physician who pioneered work on blood transfusions. He observed the circulation of blood and how it interacted with air.', 'myint@gmail.com', '+9597812345', NULL, 'Mandalay', 'unavailable'),
(15, 'dawtintin15@bones', '1bcc9eaf6ec712b2ca497983960b4f29', 'Daw Tin Tin', 15, 'Female', '1978-10-02', 'Ph.D', 'the doctors, nurses, research scientists, nutritionists. and those who brought in new medicine and techniques which helped save millions of lives.', 'tin.2bone@gmail.com', '+9592054321', NULL, 'Yangon', 'available'),
(16, 'wendymarvell16@bones', '1bcc9eaf6ec712b2ca497983960b4f29', 'Wendy Marvell', 15, 'Female', '1990-06-01', 'M.B.B.S', 'Another healer on this list\'s ranks, Wendy Marvell has proven to be both a useful resource both on and off the battlefield. Beyond being just an epic dragon slayer that takes on giant foes with her magical girl self, Wendy has performed some of the most impressive healing miracles within Fairy Tail.She\'s always quick to respond to a friend\'s need for medical help (which is pretty constant in a series that needs deus ex machina help) and has even managed to pull people from the brink of death. Dishing out pain and healing magic in equal measure, Wendy is one of the most reliable healers in anime.', 'wendymarvell@gmail.com', '+95930123456', NULL, 'Japan', 'available'),
(17, 'ukyawkyaw17@emergency', '1bcc9eaf6ec712b2ca497983960b4f29', 'U Kyaw Kyaw', 20, 'Male', '1996-10-13', 'Ph.D', '', 'kyaw@gmail.com', '+9592054789', NULL, 'Bago', 'available'),
(18, 'dawphyusin18@emergency', '1bcc9eaf6ec712b2ca497983960b4f29', 'Daw Phyu Sin', 20, 'Female', '1986-10-01', 'Ph.D', '', 'phyu@gmail.com', '+95939874562', NULL, 'Chauk', 'available');

-- --------------------------------------------------------

--
-- Table structure for table `patient`
--

CREATE TABLE `patient` (
  `patient_id` int(11) NOT NULL,
  `patient_login_name` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `patient_name` varchar(50) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `date_of_birth` date NOT NULL,
  `mail` varchar(100) NOT NULL,
  `phone` varchar(20) NOT NULL,
  `blood_type` varchar(10) DEFAULT NULL,
  `address` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `patient`
--

INSERT INTO `patient` (`patient_id`, `patient_login_name`, `password`, `patient_name`, `gender`, `date_of_birth`, `mail`, `phone`, `blood_type`, `address`) VALUES
(1, 'winAung80', 'c7f5da40b2e0db3859207583f0e2b878', 'U Win Aung Khine', 'Male', '1980-05-02', 'winaung@gmail.com', '+959256186994', 'O', 'Sein Kone, Sagaing'),
(2, 'khinHtar67', 'c7f5da40b2e0db3859207583f0e2b878', 'Daw Khin Htar May', 'Female', '1967-12-12', 'htarmay@gmail.com', '09792721887', 'O', 'Amarapura Township, Mandalay'),
(3, 'shinYei02', 'c7f5da40b2e0db3859207583f0e2b878', 'ShinYei', 'Female', '2002-02-14', 'yei@gmail.com', '09969647575', 'AB', 'ChanAyeTharZan Township, Mandalay'),
(4, 'thetHtar11', 'c7f5da40b2e0db3859207583f0e2b878', 'Thet Htar San', 'Female', '2011-03-02', 'htarsan@gmail.com', '09782589320', 'A', 'ShweBo, Sagaing'),
(5, 'sharMin09', 'c7f5da40b2e0db3859207583f0e2b878', 'Shar Min Khant', 'Male', '2009-05-14', 'minkhant@gmail.com', '09400420379', 'B', 'Bagan, Mandalay'),
(6, 'seinHtay71', 'c7f5da40b2e0db3859207583f0e2b878', 'U Sein Htay', 'Male', '1971-09-08', 'sein@gmail.com', '09763429810', 'O+', 'Pwin Oo Lwin'),
(7, 'mayKyi80', 'c7f5da40b2e0db3859207583f0e2b878', 'Daw May Kyi', 'Female', '1980-05-16', 'may@gmail.com', '09972035460', 'O', 'Yangon'),
(8, 'nilarOo04', 'c7f5da40b2e0db3859207583f0e2b878', 'Nilar Oo', 'Female', '2004-04-30', 'nilar@gmail.com', '09786497540', '', 'Pwin Oo Lwin'),
(9, 'khinYuuPa11', 'c7f5da40b2e0db3859207583f0e2b878', 'Khin Yuupar', 'Female', '2000-11-28', 'khin@gmail.com', '09256186995', 'O-', 'Pakokku'),
(10, 'thetHtar98', 'c7f5da40b2e0db3859207583f0e2b878', 'Thet Htar', 'Female', '1998-02-14', 'htar@gmail.com', '09972036379', 'B', 'Amarapura'),
(11, 'kyaw04', 'c7f5da40b2e0db3859207583f0e2b878', 'Kyaw Kyaw', 'Male', '2004-08-09', 'kyaw@gmail.com', '09969646430', 'A-', 'Pwin Oo Lwin '),
(12, 'htay04', 'c7f5da40b2e0db3859207583f0e2b878', 'Htay Hla', 'Male', '2004-08-27', 'htay@gmail.com', '09969646480', 'O', 'Mandalay'),
(13, 'aung95', 'c7f5da40b2e0db3859207583f0e2b878', 'Aung Aung', 'Male', '1995-03-15', 'aung@gmail.com', '09969646470', 'A', 'Mandalay'),
(14, 'tinMaung', 'c7f5da40b2e0db3859207583f0e2b878', 'Tin Maung', 'Male', '1979-09-11', 'maung@gmail.com', '09969846430', '', 'Sagaing'),
(17, 'yamin04', 'c7f5da40b2e0db3859207583f0e2b878', 'Yamin Hlaing', 'Female', '1990-04-04', 'yamin@gmail.com', '09794100980', '', 'Pyi Gyi Tagon'),
(55, 'yati55', 'c7f5da40b2e0db3859207583f0e2b878', 'Yati', 'Female', '2022-09-02', 'yati@gmail.com', '09123456789', '', 'Mandalay'),
(61, 'ukyawmyo56', 'c7f5da40b2e0db3859207583f0e2b878', 'U Kyaw Myo', 'Male', '1980-02-29', 'kyawmyo@gmail.com', '09123456789', '', 'Mdy'),
(63, 'dawhlathaung63', 'c7f5da40b2e0db3859207583f0e2b878', 'Daw Hla Thaung', 'Female', '1975-09-01', 'hlathaung@gmail.com', '+9592012345', '', 'Mdy'),
(64, 'mahlahla64', 'c7f5da40b2e0db3859207583f0e2b878', 'Ma Hla Hla', 'Female', '1967-02-01', 'hlahla@gmail.com', '+9592078945', '', 'Ygn'),
(65, 'myamya65', 'c7f5da40b2e0db3859207583f0e2b878', 'Mya Mya', 'Female', '1990-03-01', 'mya@gmail.com', '+95930123459', '', 'Mdy'),
(66, 'bobo66', 'c7f5da40b2e0db3859207583f0e2b878', 'Bo Bo', 'Male', '2002-02-01', 'bobo@gmail.com', '+959951234567', '', 'Bago'),
(67, 'phyuphyu67', 'c7f5da40b2e0db3859207583f0e2b878', 'Phyu Phyu', 'Male', '2002-02-01', 'phyu@gmail.com', '+959951234567', '', 'Pauk'),
(81, 'jueeaintphuethwe68', 'c7f5da40b2e0db3859207583f0e2b878', 'Jue Eaint Phue Thwe', 'Male', '2010-10-05', 'naing2oo@gmail.com', '+9592012345', '', 'fdsafdwef'),
(83, 'umyintkyaw82', 'c7f5da40b2e0db3859207583f0e2b878', 'U Myint Kyaw', 'Male', '1992-10-31', 'myint@gmail.com', '+959781234569', '', 'Mandalay'),
(85, 'dawtintin84', 'c7f5da40b2e0db3859207583f0e2b878', 'Daw Tin Tin', 'Female', '1973-10-01', 'tin.2bone@gmail.com', '+9592054321', '', 'Yangon'),
(88, 'maungnaungnaung88', 'c7f5da40b2e0db3859207583f0e2b878', 'Maung Naung Naung', 'Male', '2007-02-01', 'naung@gmail.com', '+9592012345', '', 'Taunggyi'),
(92, 'toetoe92', 'c7f5da40b2e0db3859207583f0e2b878', 'Toe Toe', 'Male', '2010-10-01', 'toetoe@gmail.com', '+95931234567', '', 'Mandalay'),
(94, NULL, 'c7f5da40b2e0db3859207583f0e2b878', 'Naing Naing Oo', 'Female', '1998-04-11', 'naing.oo.office@gmail.com', '+959952145340', '', 'Mandalay');

-- --------------------------------------------------------

--
-- Table structure for table `patient_progress`
--

CREATE TABLE `patient_progress` (
  `progress_id` int(11) NOT NULL,
  `patient_id` int(11) NOT NULL,
  `doctor_id` int(11) NOT NULL,
  `disease_name` varchar(255) DEFAULT NULL,
  `symptoms` text NOT NULL,
  `status` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `patient_progress`
--

INSERT INTO `patient_progress` (`progress_id`, `patient_id`, `doctor_id`, `disease_name`, `symptoms`, `status`) VALUES
(1, 1, 1, 'Coronary Artery Disease', 'often check pain, can\'t sleep or eat well.', 'done'),
(2, 2, 3, 'Cavities', 'bleeding between teeth', 'confirmed'),
(3, 5, 2, NULL, 'Skin and eyes appear yellowish and\r\nAbdominal pain and swelling', 'confirmed'),
(4, 1, 2, 'Primary biliary cholangitis', 'Abdominal pain and swelling.\r\nSwelling in the legs and ankles.\r\nItchy skin', 'confirmed'),
(5, 1, 6, 'Nephrolith', 'Vomiting, Loss of appetite, Fatigue and weakness, Sleep problems', 'confirmed'),
(6, 6, 6, NULL, 'Abdominal pain and swelling', 'confirmed'),
(7, 5, 2, NULL, 'yellowish skin', 'confirmed'),
(9, 1, 4, NULL, 'toothace', 'confirmed'),
(10, 5, 1, 'Coronary Artery Disease', 'heart disease', 'confirmed'),
(12, 65, 2, NULL, 'yellow skin', 'confirmed'),
(13, 88, 16, NULL, 'Car Accidient', 'confirmed'),
(15, 85, 3, NULL, 'ToothAce', 'confirmed'),
(18, 66, 1, NULL, 'Chest pain, chest tightness, chest pressure and chest discomfort (angina)', 'confirmed');

-- --------------------------------------------------------

--
-- Table structure for table `progress_detail`
--

CREATE TABLE `progress_detail` (
  `progress_detail_id` int(11) NOT NULL,
  `progress_id` int(11) NOT NULL,
  `appointment_date` date NOT NULL,
  `appointment_time` time NOT NULL,
  `appointment_status` varchar(20) NOT NULL,
  `reason` text NOT NULL,
  `progress_description` text DEFAULT NULL,
  `remark` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `progress_detail`
--

INSERT INTO `progress_detail` (`progress_detail_id`, `progress_id`, `appointment_date`, `appointment_time`, `appointment_status`, `reason`, `progress_description`, `remark`) VALUES
(1, 3, '2022-08-05', '11:00:00', 'confirmed', 'first time check up', NULL, NULL),
(2, 2, '2022-08-11', '10:00:00', 'confirmed', 'second time check up', NULL, NULL),
(3, 3, '2022-08-06', '14:00:00', 'confirmed', 'check', NULL, NULL),
(5, 3, '2022-08-31', '15:00:00', 'confirmed', 'check second time', NULL, NULL),
(6, 1, '2022-08-08', '19:00:00', 'done', 'often chest pain', 'To diagnose coronary artery disease, a health care provider will examine you. You\'ll likely be asked questions about your medical history and any symptoms. Blood tests are usually done to check your overall health.', 'Beta blockers twice a day\r\nThese drugs slow the heart rate. They also lower blood pressure. If you\'ve had a heart attack, beta blockers may reduce the risk of future attacks.'),
(7, 1, '2022-08-07', '10:00:00', 'done', 'weekly treatment', 'Treatment for coronary artery disease usually involves lifestyle changes such as not smoking, eating healthy and exercising more.', 'Aspirin one tablet once a day'),
(8, 2, '2022-08-01', '10:00:00', 'done', 'first time check up', 'a filling if a hole (cavity) in tooth.', 'don\'t eat sweat things within a week.'),
(9, 4, '2022-08-01', '09:00:00', 'done', 'first time check up', 'This patient feels immune system attacks certain parts of your body (autoimmune) can affect on liver.', 'Ursodeoxycholic acid (UDCA) is the main treatment for PBC.\r\n\r\nIt can help prevent or delay liver damage in most people, particularly if you start taking it in the early stages of the condition. But it does not improve symptoms such as itchy skin or fatigue.'),
(10, 5, '2022-08-11', '19:00:00', 'done', 'first time check up', 'Colestyramine (previously called cholestyramine) is a medicine widely used to treat the itchiness associated with PBC.\r\nIt usually comes in sachets as a powder that can be dissolved in water or fruit juice. It\'s a good idea to take the powder\r\nwith fruit juice because it has an unpleasant taste.', 'Vitamin and mineral supplements. If your body isn\'t absorbing vitamins or other nutrients, you may need to take vitamins A, D, E and K,\r\n as well as calcium, folic acid or iron supplements'),
(11, 4, '2022-09-01', '09:00:00', 'confirmed', 'monthly check up', NULL, NULL),
(12, 4, '2022-08-13', '00:00:00', 'confirmed', 'pain', NULL, NULL),
(13, 7, '2022-08-12', '09:00:00', 'confirmed', 'first time check', NULL, NULL),
(14, 5, '2022-08-18', '13:00:00', 'confirmed', 'weekly check', NULL, NULL),
(15, 4, '2022-08-11', '13:00:00', 'confirmed', 'check', NULL, NULL),
(26, 10, '2022-10-04', '08:00:00', 'confirmed', 'Check', NULL, NULL),
(27, 4, '2022-10-11', '08:00:00', 'confirmed', 'Check', NULL, NULL),
(30, 4, '2022-10-06', '07:30:00', 'confirmed', 'check', NULL, NULL),
(31, 10, '2022-10-06', '07:00:00', 'confirmed', 'To check', NULL, NULL),
(32, 6, '2022-10-07', '07:30:00', 'confirmed', 'Check', NULL, NULL),
(34, 7, '2022-10-14', '10:00:00', 'confirmed', 'Check', NULL, NULL),
(35, 13, '2022-10-09', '07:30:00', 'confirmed', 'Check', NULL, NULL),
(36, 12, '2022-10-11', '08:30:00', 'confirmed', 'First Time Checking', NULL, NULL),
(37, 5, '2022-10-09', '08:00:00', 'confirmed', 'Check', NULL, NULL),
(38, 10, '2022-10-09', '08:30:00', 'done', 'Check', ' Treatment for coronary artery disease usually involves lifestyle changes such as not smoking, eating healthy and exercising more.\r\n', 'Aspirin one tablet once a day'),
(39, 9, '2022-10-20', '08:30:00', 'confirmed', 'check', NULL, NULL),
(40, 10, '2022-10-10', '08:30:00', 'done', 'Check', 'To diagnose coronary artery\r\ndisease, a health care\r\nprovider will examine you.\r\nYou\'ll likely be asked\r\nquestions about your\r\nmedical history and any\r\nsymptoms. Blood tests are\r\nusually done to check your\r\noverall health.', 'Beta blockers twice a\r\nday\r\nThese drugs slow the\r\nheart rate. They also\r\nlower blood pressure.\r\nIf you\'ve had a heart\r\nattack, beta blockers\r\nmay reduce the risk of\r\nfuture attacks.'),
(41, 10, '2022-10-11', '08:30:00', 'confirmed', 'Weekly Check', NULL, NULL),
(42, 18, '2022-10-11', '13:00:00', 'confirmed', 'First Time Check', NULL, NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`admin_id`),
  ADD UNIQUE KEY `admin_login_name` (`admin_login_name`);

--
-- Indexes for table `department`
--
ALTER TABLE `department`
  ADD PRIMARY KEY (`department_id`),
  ADD UNIQUE KEY `department_name` (`department_name`);

--
-- Indexes for table `doctor`
--
ALTER TABLE `doctor`
  ADD PRIMARY KEY (`doctor_id`),
  ADD UNIQUE KEY `doctor_login_name` (`doctor_login_name`),
  ADD KEY `department` (`department`);

--
-- Indexes for table `patient`
--
ALTER TABLE `patient`
  ADD PRIMARY KEY (`patient_id`),
  ADD UNIQUE KEY `mail` (`mail`),
  ADD UNIQUE KEY `patient_login_name` (`patient_login_name`);

--
-- Indexes for table `patient_progress`
--
ALTER TABLE `patient_progress`
  ADD PRIMARY KEY (`progress_id`),
  ADD KEY `patient_id` (`patient_id`),
  ADD KEY `doctor_id` (`doctor_id`);

--
-- Indexes for table `progress_detail`
--
ALTER TABLE `progress_detail`
  ADD PRIMARY KEY (`progress_detail_id`),
  ADD KEY `progress_id` (`progress_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `admin_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `department`
--
ALTER TABLE `department`
  MODIFY `department_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT for table `doctor`
--
ALTER TABLE `doctor`
  MODIFY `doctor_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT for table `patient`
--
ALTER TABLE `patient`
  MODIFY `patient_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=95;

--
-- AUTO_INCREMENT for table `patient_progress`
--
ALTER TABLE `patient_progress`
  MODIFY `progress_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT for table `progress_detail`
--
ALTER TABLE `progress_detail`
  MODIFY `progress_detail_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=43;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `doctor`
--
ALTER TABLE `doctor`
  ADD CONSTRAINT `doctor_ibfk_1` FOREIGN KEY (`department`) REFERENCES `department` (`department_id`);

--
-- Constraints for table `patient_progress`
--
ALTER TABLE `patient_progress`
  ADD CONSTRAINT `patient_progress_ibfk_1` FOREIGN KEY (`patient_id`) REFERENCES `patient` (`patient_id`),
  ADD CONSTRAINT `patient_progress_ibfk_2` FOREIGN KEY (`doctor_id`) REFERENCES `doctor` (`doctor_id`);

--
-- Constraints for table `progress_detail`
--
ALTER TABLE `progress_detail`
  ADD CONSTRAINT `progress_detail_ibfk_1` FOREIGN KEY (`progress_id`) REFERENCES `patient_progress` (`progress_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
