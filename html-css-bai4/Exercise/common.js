const TXTNAME = 'txtName';
const TXTEMAIL  = 'txtEmail';
const TXTWEBSITE = 'txtWebsite';
const TXTMESSAGE = 'txtMessage';
const Color = {
	backgroundColorError:'#e89f9f',
	borderColorError:'red',
	backgroundColor:'#FFFFFF',
	borderColor:'#CCCCCC',
	sucessMessage: 'green'
}

const validation = {
    isEmailAddress:function(str) {
        var pattern =/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
        return pattern.test(str);  // returns a boolean
    },
    isString: function (str) {
    	var pattern = /^([a-z A-Z]{1,20})$/;
    	return pattern.test(str);
    },
    isURL: function (str) {
    	// body... 
    	var regex = new RegExp("^(http[s]?:\\/\\/(www\\.)?|ftp:\\/\\/(www\\.)?|www\\.){1}([0-9A-Za-z-\\.@:%_\+~#=]+)+((\\.[a-zA-Z]{2,3})+)(/(.)*)?(\\?(.)*)?");
    	return regex.test(str);
    },
    isNotEmpty:function (str) {
        var pattern =/\S+/;
        return pattern.test(str);  // returns a boolean
    },
    isNumber:function(str) {
        var pattern = /^\d+$/;
        return pattern.test(str);  // returns a boolean
    },
    isSame:function(str1,str2){
        return str1 === str2;
    }
}; 