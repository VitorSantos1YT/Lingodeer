package com.lingodeer.data.model.characterstroke;

import com.lingodeer.database.model.CharacterStrokeGroupEntity;
import com.tbruyelle.rxpermissions3.BuildConfig;
import kotlin.jvm.internal.m;
import zt.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class CharacterStrokeGroupKt {
    public static final CharacterStrokeGroupEntity asEntityModel(CharacterStrokeGroup characterStrokeGroup) {
        m.f(characterStrokeGroup, "<this>");
        long groupId = characterStrokeGroup.getGroupId();
        int groupIndex = characterStrokeGroup.getGroupIndex();
        a aVar = new a(characterStrokeGroup.getGroupList());
        return new CharacterStrokeGroupEntity(groupId, groupIndex, new a(characterStrokeGroup.getGroupName()), aVar, new a(characterStrokeGroup.getTGroupName()), new a(characterStrokeGroup.getTGroupList()));
    }

    public static final CharacterStrokeGroup asExternalModel(CharacterStrokeGroupEntity characterStrokeGroupEntity) {
        String str;
        String str2;
        String str3;
        String str4;
        m.f(characterStrokeGroupEntity, "<this>");
        long groupId = characterStrokeGroupEntity.getGroupId();
        int groupIndex = characterStrokeGroupEntity.getGroupIndex();
        a groupList = characterStrokeGroupEntity.getGroupList();
        if (groupList == null || (str = groupList.f59371a) == null) {
            str = BuildConfig.VERSION_NAME;
        }
        a groupName = characterStrokeGroupEntity.getGroupName();
        if (groupName == null || (str2 = groupName.f59371a) == null) {
            str2 = BuildConfig.VERSION_NAME;
        }
        a tGroupList = characterStrokeGroupEntity.getTGroupList();
        if (tGroupList == null || (str3 = tGroupList.f59371a) == null) {
            str3 = BuildConfig.VERSION_NAME;
        }
        a tGroupName = characterStrokeGroupEntity.getTGroupName();
        return new CharacterStrokeGroup(groupId, groupIndex, str, str2, str3, (tGroupName == null || (str4 = tGroupName.f59371a) == null) ? BuildConfig.VERSION_NAME : str4);
    }
}
