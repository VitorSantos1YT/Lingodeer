package com.google.firebase.auth.internal;

import aj.uZCn.evRpcb;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.api.Service;
import com.google.protobuf.DescriptorProtos;
import com.lingodeer.data.model.AchievementLevelType;
import com.stkouyu.util.httputil.Consts;
import com.yalantis.ucrop.UCrop;
import ep.a;
import java.util.Arrays;
import java.util.List;
import mf.sOm.txBUGYhC;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzaq {
    public static Status a(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return new Status(17499, null, null, null);
        }
        String[] strArrSplit = str.split(":", 2);
        strArrSplit[0] = strArrSplit[0].trim();
        if (strArrSplit.length > 1 && (str2 = strArrSplit[1]) != null) {
            strArrSplit[1] = str2.trim();
        }
        List listAsList = Arrays.asList(strArrSplit);
        return listAsList.size() > 1 ? b((String) listAsList.get(0), (String) listAsList.get(1)) : b((String) listAsList.get(0), null);
    }

    public static Status b(String str, String str2) {
        int i11;
        str.getClass();
        byte b3 = -1;
        switch (str.hashCode()) {
            case -2130504259:
                if (str.equals("USER_CANCELLED")) {
                    b3 = 0;
                }
                break;
            case -2065866930:
                if (str.equals("INVALID_RECIPIENT_EMAIL")) {
                    b3 = 1;
                }
                break;
            case -2014808264:
                if (str.equals("WEB_CONTEXT_ALREADY_PRESENTED")) {
                    b3 = 2;
                }
                break;
            case -2005236790:
                if (str.equals("INTERNAL_SUCCESS_SIGN_OUT")) {
                    b3 = 3;
                }
                break;
            case -2001169389:
                if (str.equals("INVALID_IDP_RESPONSE")) {
                    b3 = 4;
                }
                break;
            case -1944433728:
                if (str.equals("DYNAMIC_LINK_NOT_ACTIVATED")) {
                    b3 = 5;
                }
                break;
            case -1800638118:
                if (str.equals("QUOTA_EXCEEDED")) {
                    b3 = 6;
                }
                break;
            case -1774756919:
                if (str.equals("WEB_NETWORK_REQUEST_FAILED")) {
                    b3 = 7;
                }
                break;
            case -1699246888:
                if (str.equals("INVALID_RECAPTCHA_VERSION")) {
                    b3 = 8;
                }
                break;
            case -1603818979:
                if (str.equals("RECAPTCHA_NOT_ENABLED")) {
                    b3 = 9;
                }
                break;
            case -1587614300:
                if (str.equals("EXPIRED_OOB_CODE")) {
                    b3 = 10;
                }
                break;
            case -1584641425:
                if (str.equals("UNAUTHORIZED_DOMAIN")) {
                    b3 = 11;
                }
                break;
            case -1583894766:
                if (str.equals("INVALID_OOB_CODE")) {
                    b3 = 12;
                }
                break;
            case -1458751677:
                if (str.equals("MISSING_EMAIL")) {
                    b3 = 13;
                }
                break;
            case -1421414571:
                if (str.equals("INVALID_CODE")) {
                    b3 = 14;
                }
                break;
            case -1368998244:
                if (str.equals("INVALID_HOSTING_LINK_DOMAIN")) {
                    b3 = 15;
                }
                break;
            case -1345867105:
                if (str.equals("TOKEN_EXPIRED")) {
                    b3 = 16;
                }
                break;
            case -1340100504:
                if (str.equals("INVALID_TENANT_ID")) {
                    b3 = 17;
                }
                break;
            case -1242922234:
                if (str.equals("ALTERNATE_CLIENT_IDENTIFIER_REQUIRED")) {
                    b3 = 18;
                }
                break;
            case -1232010689:
                if (str.equals("INVALID_SESSION_INFO")) {
                    b3 = 19;
                }
                break;
            case -1202691903:
                if (str.equals("SECOND_FACTOR_EXISTS")) {
                    b3 = 20;
                }
                break;
            case -1112393964:
                if (str.equals("INVALID_EMAIL")) {
                    b3 = 21;
                }
                break;
            case -1063710844:
                if (str.equals("ADMIN_ONLY_OPERATION")) {
                    b3 = 22;
                }
                break;
            case -974503964:
                if (str.equals(txBUGYhC.GhV)) {
                    b3 = 23;
                }
                break;
            case -863830559:
                if (str.equals("INVALID_CERT_HASH")) {
                    b3 = 24;
                }
                break;
            case -828507413:
                if (str.equals("NO_SUCH_PROVIDER")) {
                    b3 = 25;
                }
                break;
            case -749743758:
                if (str.equals("MFA_ENROLLMENT_NOT_FOUND")) {
                    b3 = 26;
                }
                break;
            case -736207500:
                if (str.equals("MISSING_PASSWORD")) {
                    b3 = 27;
                }
                break;
            case -646022241:
                if (str.equals("CREDENTIAL_TOO_OLD_LOGIN_AGAIN")) {
                    b3 = 28;
                }
                break;
            case -595928767:
                if (str.equals("TIMEOUT")) {
                    b3 = 29;
                }
                break;
            case -505579581:
                if (str.equals("INVALID_REQ_TYPE")) {
                    b3 = 30;
                }
                break;
            case -406804866:
                if (str.equals("INVALID_LOGIN_CREDENTIALS")) {
                    b3 = 31;
                }
                break;
            case -380728810:
                if (str.equals("INVALID_RECAPTCHA_ACTION")) {
                    b3 = 32;
                }
                break;
            case -333672188:
                if (str.equals("OPERATION_NOT_ALLOWED")) {
                    b3 = 33;
                }
                break;
            case -294485423:
                if (str.equals("WEB_INTERNAL_ERROR")) {
                    b3 = 34;
                }
                break;
            case -217128228:
                if (str.equals("SECOND_FACTOR_LIMIT_EXCEEDED")) {
                    b3 = 35;
                }
                break;
            case -122667194:
                if (str.equals("MISSING_MFA_ENROLLMENT_ID")) {
                    b3 = 36;
                }
                break;
            case -75433118:
                if (str.equals("USER_NOT_FOUND")) {
                    b3 = 37;
                }
                break;
            case -52772551:
                if (str.equals("CAPTCHA_CHECK_FAILED")) {
                    b3 = 38;
                }
                break;
            case -40686718:
                if (str.equals("WEAK_PASSWORD")) {
                    b3 = 39;
                }
                break;
            case 15352275:
                if (str.equals("EMAIL_NOT_FOUND")) {
                    b3 = 40;
                }
                break;
            case 210308040:
                if (str.equals("UNSUPPORTED_FIRST_FACTOR")) {
                    b3 = 41;
                }
                break;
            case 269327773:
                if (str.equals("INVALID_SENDER")) {
                    b3 = 42;
                }
                break;
            case 278802867:
                if (str.equals("MISSING_PHONE_NUMBER")) {
                    b3 = 43;
                }
                break;
            case 408411681:
                if (str.equals("INVALID_DYNAMIC_LINK_DOMAIN")) {
                    b3 = 44;
                }
                break;
            case 423563023:
                if (str.equals("MISSING_MFA_PENDING_CREDENTIAL")) {
                    b3 = 45;
                }
                break;
            case 429251986:
                if (str.equals("UNSUPPORTED_PASSTHROUGH_OPERATION")) {
                    b3 = 46;
                }
                break;
            case 483847807:
                if (str.equals("EMAIL_EXISTS")) {
                    b3 = 47;
                }
                break;
            case 491979549:
                if (str.equals("INVALID_ID_TOKEN")) {
                    b3 = 48;
                }
                break;
            case 492072102:
                if (str.equals("WEB_STORAGE_UNSUPPORTED")) {
                    b3 = 49;
                }
                break;
            case 492515765:
                if (str.equals("MISSING_CLIENT_TYPE")) {
                    b3 = 50;
                }
                break;
            case 530628231:
                if (str.equals("MISSING_RECAPTCHA_VERSION")) {
                    b3 = 51;
                }
                break;
            case 542728406:
                if (str.equals("PASSWORD_LOGIN_DISABLED")) {
                    b3 = 52;
                }
                break;
            case 582457886:
                if (str.equals("UNVERIFIED_EMAIL")) {
                    b3 = 53;
                }
                break;
            case 605031096:
                if (str.equals("REJECTED_CREDENTIAL")) {
                    b3 = 54;
                }
                break;
            case 745638750:
                if (str.equals("INVALID_MFA_PENDING_CREDENTIAL")) {
                    b3 = 55;
                }
                break;
            case 786916712:
                if (str.equals("INVALID_VERIFICATION_PROOF")) {
                    b3 = 56;
                }
                break;
            case 799258561:
                if (str.equals(evRpcb.OOoguTw)) {
                    b3 = 57;
                }
                break;
            case 819646646:
                if (str.equals("CREDENTIAL_MISMATCH")) {
                    b3 = 58;
                }
                break;
            case 844240628:
                if (str.equals("WEB_CONTEXT_CANCELED")) {
                    b3 = 59;
                }
                break;
            case 886186878:
                if (str.equals("REQUIRES_SECOND_FACTOR_AUTH")) {
                    b3 = 60;
                }
                break;
            case 895302372:
                if (str.equals("MISSING_CLIENT_IDENTIFIER")) {
                    b3 = 61;
                }
                break;
            case 922685102:
                if (str.equals("INVALID_MESSAGE_PAYLOAD")) {
                    b3 = 62;
                }
                break;
            case 989000548:
                if (str.equals("RESET_PASSWORD_EXCEED_LIMIT")) {
                    b3 = 63;
                }
                break;
            case 1034932393:
                if (str.equals("INVALID_PENDING_TOKEN")) {
                    b3 = 64;
                }
                break;
            case 1072360691:
                if (str.equals("INVALID_CUSTOM_TOKEN")) {
                    b3 = 65;
                }
                break;
            case 1094975491:
                if (str.equals("INVALID_PASSWORD")) {
                    b3 = 66;
                }
                break;
            case 1107081238:
                if (str.equals("<<Network Error>>")) {
                    b3 = 67;
                }
                break;
            case 1113992697:
                if (str.equals("INVALID_RECAPTCHA_TOKEN")) {
                    b3 = 68;
                }
                break;
            case 1141576252:
                if (str.equals("SESSION_EXPIRED")) {
                    b3 = 69;
                }
                break;
            case 1199811910:
                if (str.equals("MISSING_CODE")) {
                    b3 = 70;
                }
                break;
            case 1226505451:
                if (str.equals("FEDERATED_USER_ID_ALREADY_LINKED")) {
                    b3 = 71;
                }
                break;
            case 1308491624:
                if (str.equals("MISSING_RECAPTCHA_TOKEN")) {
                    b3 = 72;
                }
                break;
            case 1388786705:
                if (str.equals("INVALID_IDENTIFIER")) {
                    b3 = 73;
                }
                break;
            case 1433767024:
                if (str.equals("USER_DISABLED")) {
                    b3 = 74;
                }
                break;
            case 1442968770:
                if (str.equals("INVALID_PHONE_NUMBER")) {
                    b3 = 75;
                }
                break;
            case 1494923453:
                if (str.equals("INVALID_APP_CREDENTIAL")) {
                    b3 = 76;
                }
                break;
            case 1497901284:
                if (str.equals("TOO_MANY_ATTEMPTS_TRY_LATER")) {
                    b3 = 77;
                }
                break;
            case 1803454477:
                if (str.equals("MISSING_CONTINUE_URI")) {
                    b3 = 78;
                }
                break;
            case 1898790704:
                if (str.equals("MISSING_SESSION_INFO")) {
                    b3 = 79;
                }
                break;
            case 2063209097:
                if (str.equals("EMAIL_CHANGE_NEEDS_VERIFICATION")) {
                    b3 = 80;
                }
                break;
            case 2082564316:
                if (str.equals("UNSUPPORTED_TENANT_OPERATION")) {
                    b3 = 81;
                }
                break;
        }
        switch (b3) {
            case 0:
                i11 = 18001;
                break;
            case 1:
                i11 = 17033;
                break;
            case 2:
                i11 = 17057;
                break;
            case 3:
                i11 = 17091;
                break;
            case 4:
            case 31:
            case 64:
                i11 = 17004;
                break;
            case 5:
                i11 = 17068;
                break;
            case 6:
                i11 = 17052;
                break;
            case 7:
                i11 = 17061;
                break;
            case 8:
                i11 = 17206;
                break;
            case 9:
                i11 = 17200;
                break;
            case 10:
                i11 = 17029;
                break;
            case 11:
                i11 = 17038;
                break;
            case 12:
                i11 = 17030;
                break;
            case 13:
                i11 = 17034;
                break;
            case 14:
                i11 = 17044;
                break;
            case 15:
                i11 = 17214;
                break;
            case 16:
                i11 = 17021;
                break;
            case 17:
                i11 = 17079;
                break;
            case 18:
                i11 = 18002;
                break;
            case 19:
                i11 = 17046;
                break;
            case 20:
                i11 = 17087;
                break;
            case 21:
            case 73:
                i11 = 17008;
                break;
            case 22:
                i11 = 17085;
                break;
            case 23:
                i11 = 17094;
                break;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                i11 = 17064;
                break;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                i11 = 17016;
                break;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                i11 = 17084;
                break;
            case 27:
                i11 = 17035;
                break;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                i11 = 17014;
                break;
            case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
            case 67:
                i11 = 17020;
                break;
            case 30:
                i11 = 17207;
                break;
            case Consts.SP /* 32 */:
                i11 = 17203;
                break;
            case 33:
            case 52:
                i11 = 17006;
                break;
            case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                i11 = 17062;
                break;
            case 35:
                i11 = 17088;
                break;
            case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                i11 = 17082;
                break;
            case 37:
            case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                i11 = 17011;
                break;
            case 38:
                i11 = 17056;
                break;
            case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                i11 = 17026;
                break;
            case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                i11 = 17089;
                break;
            case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                i11 = 17032;
                break;
            case 43:
                i11 = 17041;
                break;
            case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                i11 = 17074;
                break;
            case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                i11 = 17081;
                break;
            case 46:
                i11 = 17095;
                break;
            case 47:
                i11 = 17007;
                break;
            case 48:
                i11 = 17017;
                break;
            case 49:
                i11 = 17065;
                break;
            case 50:
                i11 = 17204;
                break;
            case 51:
                i11 = 17205;
                break;
            case 53:
                i11 = 17086;
                break;
            case 54:
                i11 = 17075;
                break;
            case 55:
                i11 = 17083;
                break;
            case 56:
                i11 = 17049;
                break;
            case 57:
                i11 = 17071;
                break;
            case 58:
                i11 = 17002;
                break;
            case 59:
                i11 = 17058;
                break;
            case 60:
                i11 = 17078;
                break;
            case 61:
                i11 = 17093;
                break;
            case 62:
                i11 = 17031;
                break;
            case 63:
            case 77:
                i11 = 17010;
                break;
            case 65:
                i11 = 17000;
                break;
            case 66:
                i11 = 17009;
                break;
            case 68:
                i11 = 17202;
                break;
            case UCrop.REQUEST_CROP /* 69 */:
                i11 = 17051;
                break;
            case 70:
                i11 = 17043;
                break;
            case 71:
                i11 = 17025;
                break;
            case 72:
                i11 = 17201;
                break;
            case 74:
                i11 = 17005;
                break;
            case AchievementLevelType.DAY_STREAK_LV_6 /* 75 */:
                i11 = 17042;
                break;
            case 76:
                i11 = 17028;
                break;
            case 78:
                i11 = 17040;
                break;
            case 79:
                i11 = 17045;
                break;
            case 80:
                i11 = 17090;
                break;
            case 81:
                i11 = 17073;
                break;
            default:
                i11 = 17499;
                break;
        }
        if (i11 == 17499) {
            if (str2 != null) {
                return new Status(i11, a.D(str, ":", str2), null, null);
            }
            return new Status(i11, str, null, null);
        }
        return new Status(i11, str2, null, null);
    }
}
