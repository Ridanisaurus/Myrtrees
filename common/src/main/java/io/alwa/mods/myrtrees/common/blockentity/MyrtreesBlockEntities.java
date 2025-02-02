package io.alwa.mods.myrtrees.common.blockentity;

import io.alwa.mods.myrtrees.common.Myrtrees;
import io.alwa.mods.myrtrees.common.block.MyrtreesBlocks;
import me.shedaniel.architectury.registry.DeferredRegister;
import net.minecraft.core.Registry;
import net.minecraft.world.level.block.entity.BlockEntityType;

import java.util.function.Supplier;

public interface MyrtreesBlockEntities {
    DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(Myrtrees.MOD_ID, Registry.BLOCK_ENTITY_TYPE_REGISTRY);

    Supplier<BlockEntityType> FILLED_RUBBERWOOD_LOG = REGISTRY.register("filled_rubberwood_log", () -> BlockEntityType.Builder.of(FilledRubberwoodLogBlockEntity::new, MyrtreesBlocks.FILLED_RUBBERWOOD_LOG.get()).build(null));
    Supplier<BlockEntityType> TREE_TAP = REGISTRY.register("tree_tap", () -> BlockEntityType.Builder.of(TreeTapBlockEntity::new, MyrtreesBlocks.TREE_TAP.get()).build(null));
    Supplier<BlockEntityType> WOODEN_BUCKET = REGISTRY.register("wooden_bucket", () -> BlockEntityType.Builder.of(WoodenBucketBlockEntity::new, MyrtreesBlocks.WOODEN_BUCKET.get()).build(null));
}
