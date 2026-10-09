package com.lingodeer.database.model;

import com.google.android.material.datepicker.d;
import defpackage.e;
import kotlin.jvm.internal.m;
import zt.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class CharacterStrokeGroupEntity {
    private final long groupId;
    private final int groupIndex;
    private final a groupList;
    private final a groupName;
    private final a tGroupList;
    private final a tGroupName;

    public CharacterStrokeGroupEntity(long j11, int i11, a aVar, a aVar2, a aVar3, a aVar4) {
        this.groupId = j11;
        this.groupIndex = i11;
        this.groupName = aVar;
        this.groupList = aVar2;
        this.tGroupName = aVar3;
        this.tGroupList = aVar4;
    }

    public static /* synthetic */ CharacterStrokeGroupEntity copy$default(CharacterStrokeGroupEntity characterStrokeGroupEntity, long j11, int i11, a aVar, a aVar2, a aVar3, a aVar4, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j11 = characterStrokeGroupEntity.groupId;
        }
        long j12 = j11;
        if ((i12 & 2) != 0) {
            i11 = characterStrokeGroupEntity.groupIndex;
        }
        int i13 = i11;
        if ((i12 & 4) != 0) {
            aVar = characterStrokeGroupEntity.groupName;
        }
        a aVar5 = aVar;
        if ((i12 & 8) != 0) {
            aVar2 = characterStrokeGroupEntity.groupList;
        }
        a aVar6 = aVar2;
        if ((i12 & 16) != 0) {
            aVar3 = characterStrokeGroupEntity.tGroupName;
        }
        a aVar7 = aVar3;
        if ((i12 & 32) != 0) {
            aVar4 = characterStrokeGroupEntity.tGroupList;
        }
        return characterStrokeGroupEntity.copy(j12, i13, aVar5, aVar6, aVar7, aVar4);
    }

    public final long component1() {
        return this.groupId;
    }

    public final int component2() {
        return this.groupIndex;
    }

    public final a component3() {
        return this.groupName;
    }

    public final a component4() {
        return this.groupList;
    }

    public final a component5() {
        return this.tGroupName;
    }

    public final a component6() {
        return this.tGroupList;
    }

    public final CharacterStrokeGroupEntity copy(long j11, int i11, a aVar, a aVar2, a aVar3, a aVar4) {
        return new CharacterStrokeGroupEntity(j11, i11, aVar, aVar2, aVar3, aVar4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CharacterStrokeGroupEntity)) {
            return false;
        }
        CharacterStrokeGroupEntity characterStrokeGroupEntity = (CharacterStrokeGroupEntity) obj;
        return this.groupId == characterStrokeGroupEntity.groupId && this.groupIndex == characterStrokeGroupEntity.groupIndex && m.a(this.groupName, characterStrokeGroupEntity.groupName) && m.a(this.groupList, characterStrokeGroupEntity.groupList) && m.a(this.tGroupName, characterStrokeGroupEntity.tGroupName) && m.a(this.tGroupList, characterStrokeGroupEntity.tGroupList);
    }

    public final long getGroupId() {
        return this.groupId;
    }

    public final int getGroupIndex() {
        return this.groupIndex;
    }

    public final a getGroupList() {
        return this.groupList;
    }

    public final a getGroupName() {
        return this.groupName;
    }

    public final a getTGroupList() {
        return this.tGroupList;
    }

    public final a getTGroupName() {
        return this.tGroupName;
    }

    public int hashCode() {
        int iB = e.b(this.groupIndex, Long.hashCode(this.groupId) * 31, 31);
        a aVar = this.groupName;
        int iHashCode = (iB + (aVar == null ? 0 : aVar.hashCode())) * 31;
        a aVar2 = this.groupList;
        int iHashCode2 = (iHashCode + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        a aVar3 = this.tGroupName;
        int iHashCode3 = (iHashCode2 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
        a aVar4 = this.tGroupList;
        return iHashCode3 + (aVar4 != null ? aVar4.hashCode() : 0);
    }

    public String toString() {
        long j11 = this.groupId;
        int i11 = this.groupIndex;
        a aVar = this.groupName;
        a aVar2 = this.groupList;
        a aVar3 = this.tGroupName;
        a aVar4 = this.tGroupList;
        StringBuilder sb2 = new StringBuilder("CharacterStrokeGroupEntity(groupId=");
        sb2.append(j11);
        sb2.append(", groupIndex=");
        sb2.append(i11);
        d.y(sb2, ", groupName=", aVar, ", groupList=", aVar2);
        d.y(sb2, ", tGroupName=", aVar3, ", tGroupList=", aVar4);
        sb2.append(")");
        return sb2.toString();
    }
}
