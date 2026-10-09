package com.pairip.application;

import android.content.Context;
import com.lingo.lingoskill.LingoSkillApplication;
import com.pairip.SignatureCheck;
import com.pairip.VMRunner;
import com.pairip.licensecheck.LicenseClient;

/* JADX INFO: loaded from: classes.dex */
public class Application extends LingoSkillApplication {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // i9.b, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        VMRunner.setContext(context);
        SignatureCheck.verifyIntegrity(context);
        LicenseClient.checkLicense(context);
        super.attachBaseContext(context);
    }
}
