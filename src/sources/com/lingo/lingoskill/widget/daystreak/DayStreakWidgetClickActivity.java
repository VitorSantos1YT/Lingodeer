package com.lingo.lingoskill.widget.daystreak;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.lingo.lingoskill.ui.base.SplashActivity;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class DayStreakWidgetClickActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (isTaskRoot()) {
            startActivity(new Intent(this, (Class<?>) SplashActivity.class));
        }
        finish();
    }
}
